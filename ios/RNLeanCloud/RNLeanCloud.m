//
//  RNLeanCloud.m
//  RNLeanCloud
//
//  Created by Neo on 16/8/24.
//  Copyright © 2016 Neo. All rights reserved.
//

#import "RNLeanCloud.h"

@implementation RNLeanCloud

RCT_EXPORT_MODULE()

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

- (NSDictionary *)constantsToExport
{
    return @{
       @"appId": [[NSBundle mainBundle] objectForInfoDictionaryKey:@"LeanCloudAppId"],
       @"appKey": [[NSBundle mainBundle] objectForInfoDictionaryKey:@"LeanCloudAppKey"],
		};
}

@end