// {
//     "name": "API Evangelist",
//     "description": "This is an inventory of APIs available as part of the API Evangelist network.",
//     "image": "https://s3.amazonaws.com/kinlane-productions/api-evangelist/t-shirts/KL_InApiWeTrust-1000.png",
//     "tags": [
//       "application programming interface",
//       "API",
//       "News",
//       "Analysis"
//     ],
//     "created": "2014-04-07",
//     "modified": "2014-07-09",
//     "url": "http://apievangelist.com/apis.json",
//     "specificationVersion": "0.15",
//     "apis": [
//       {
//         "name": "Analysis",
//         "description": "Provides access to blog posts and analysis across the API Evangelist network.",
//         "image": "https://s3.amazonaws.com/kinlane-productions/api-evangelist/t-shirts/KL_InApiWeTrust-1000.png",
//         "humanURL": "http://developer.apievangelist.com",
//         "baseURL": "http://api.apievangelist.com/definitions/Analysis",
//         "tags": [
//           "blog",
//           "industry",
//           "analysis",
//           "new",
//           "API",
//           "Application Programming Interface"
//         ],
//         "properties": [
//           {
//             "type": "X-signup",
//             "url": "https://apievangelist.3scale.net/"
//           },
//           {
//             "type": "Swagger",
//             "url": "http://api.apievangelist.com/definitions/Analysis"
//           },
//           {
//             "type": "X-blog",
//             "url": "http://developer.apievangelist.com/blog/"
//           },
//           {
//             "type": "X-apicommonsmanifest",
//             "url": "https://raw.githubusercontent.com/kinlane/analysis-api/master/api-commons-manifest.json"
//           }
//         ],
//         "contact": [
//           {
//             "FN": "API Evangliest",
//             "email": "info@apievangelist.com",
//             "X-twitter": "apievangelist"
//           }
//         ]
//       },
//       {
//         "name": "APIs",
//         "description": "Provides access to APIs that are being tracked across the API Evangelist network.",
//         "image": "https://s3.amazonaws.com/kinlane-productions/api-evangelist/t-shirts/KL_InApiWeTrust-1000.png",
//         "humanURL": "http://developer.apievangelist.com",
//         "baseURL": "http://api.apievangelist.com/definitions/APIs",
//         "tags": [
//           "application programming interface",
//           "API"
//         ],
//         "properties": [
//           {
//             "type": "X-signup",
//             "url": "https://apievangelist.3scale.net/"
//           },
//           {
//             "type": "Swagger",
//             "url": "http://api.apievangelist.com/definitions/APIs"
//           },
//           {
//             "type": "X-blog",
//             "url": "http://developer.apievangelist.com/blog/"
//           },
//           {
//             "type": "X-apicommonsmanifest",
//             "url": "https://raw.githubusercontent.com/kinlane/api-api/master/api-commons-manifest.json"
//           }
//         ],
//         "contact": [
//           {
//             "FN": "API Evangliest",
//             "email": "info@apievangelist.com",
//             "X-twitter": "apievangelist"
//           }
//         ]
//       }
//     ],
//     "include": [
//       {
//         "name": "API Evangelist - Products",
//         "url": "http://products.apievangelist.com/apis.json"
//       },
//       {
//         "name": "API Evangelist - Screen Capture",
//         "url": "http://screen-capture.apievangelist.com/apis.json"
//       },
//       {
//         "name": "API Evangelist - Image Manipulation",
//         "url": "http://image.manipulation.apievangelist.com/apis.json"
//       },
//       {
//         "name": "API Evangelist - API Ideas",
//         "url": "http://ideas.apievangelist.com/apis.json"
//       },
//       {
//         "name": "API Commons",
//         "url": "http://apicommons.org/apis.json"
//       }
//     ],
//     "maintainers": [
//       {
//         "FN": "Kin",
//         "X-twitter": "apievangelist",
//         "email": "kin@email.com",
//         "vCard":"http://staging.apis.io/vCards/testVcard.vcf"
//       }
//     ]
//   }

import java.sql.Date;
import java.util.List;
public class FirstApi {
    private String name;
    private String description;
    private List<Tags> tags;
    private Date createdDate;
    private Date Modified;
    private String url;
    private String specficationVersion;
    private List<Apis> apis;
    private List<Properties> properties;
    private List<Contact> contact;
    private List<Include> include;

}