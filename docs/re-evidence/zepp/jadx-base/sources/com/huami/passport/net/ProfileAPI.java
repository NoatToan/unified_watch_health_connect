package com.huami.passport.net;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.toolbox.RequestFuture;
import com.huami.passport.Configs;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.Profile;
import com.huami.passport.net.ProfileAPI;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileAPI extends WebAPI {
    public static Profile getProfile(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            HMLog.error(new Function0() { // from class: w36
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileAPI.lambda$getProfile$0();
                }
            });
            return null;
        }
        RequestFuture requestFutureNewFuture = RequestFuture.newFuture();
        HashMap map = new HashMap();
        map.put(Configs.Params.APP_TOKEN, str2);
        final String str3 = String.format(HttpDnsCache.getAccountUrl(context, Configs.PATH.USER_PROFILE), str) + "?" + Utils.encodeParameters(map);
        EntityRequest entityRequest = new EntityRequest(0, str3, null, Profile.class, requestFutureNewFuture, requestFutureNewFuture);
        entityRequest.setShouldCache(false);
        RequestQueueHolder.addRequest(context, WebAPI.setRetryPolicy(entityRequest));
        HMLog.debug(new Function0() { // from class: v36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileAPI.lambda$getProfile$1(str3);
            }
        });
        try {
            return (Profile) requestFutureNewFuture.get();
        } catch (Exception e) {
            Profile profile = new Profile();
            profile.setErrorCode(WebAPI.getError(e));
            return profile;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getProfile$0() {
        return "getProfile error--appToken is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getProfile$1(String str) {
        return str;
    }
}
