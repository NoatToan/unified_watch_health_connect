package com.linecorp.linesdk.auth.internal;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.amazon.identity.auth.device.endpoint.OauthCodeForTokenRequest;
import com.facebook.internal.ServerProtocol;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.a.e;
import com.linecorp.linesdk.a.f;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class c {

    @NonNull
    public final LineAuthenticationActivity a;

    @NonNull
    public final LineAuthenticationConfig b;

    @NonNull
    public final com.linecorp.linesdk.a.a.b c;

    @NonNull
    public final com.linecorp.linesdk.a.a.d d;

    @NonNull
    public final com.linecorp.linesdk.auth.internal.a e;

    @NonNull
    public final com.linecorp.linesdk.a.a f;

    @Nullable
    public final String[] g;

    @NonNull
    public final d h;

    public class a extends AsyncTask<String, Void, LineLoginResult> {
        private a() {
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ LineLoginResult doInBackground(@Nullable String[] strArr) {
            String[] strArr2 = strArr;
            String str = (strArr2 == null || strArr2.length != 1) ? null : strArr2[0];
            d dVar = c.this.h;
            f fVar = dVar.a;
            String str2 = dVar.b;
            if (TextUtils.isEmpty(str) || fVar == null || TextUtils.isEmpty(str2)) {
                return new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Requested data is missing."));
            }
            c cVar = c.this;
            com.linecorp.linesdk.a.a.b bVar = cVar.c;
            String channelId = cVar.b.getChannelId();
            Uri uriBuild = bVar.f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap map = new HashMap(5);
            map.put("grant_type", OauthCodeForTokenRequest.AUTHORIZATION_CODE_GRANT);
            map.put("code", str);
            map.put("redirect_uri", str2);
            map.put("client_id", channelId);
            map.put(DTransferConstants.OTP, fVar.b);
            LineApiResponse lineApiResponseA = bVar.g.a(uriBuild, Collections.emptyMap(), map, com.linecorp.linesdk.a.a.b.b);
            if (!lineApiResponseA.isSuccess()) {
                return c.a(lineApiResponseA);
            }
            e eVar = (e) lineApiResponseA.getResponseData();
            com.linecorp.linesdk.a.d dVar2 = eVar.a;
            LineApiResponse<LineProfile> lineApiResponseA2 = c.this.d.a(dVar2);
            if (!lineApiResponseA2.isSuccess()) {
                return c.a(lineApiResponseA2);
            }
            c.this.f.a(dVar2);
            return new LineLoginResult(lineApiResponseA2.getResponseData(), new LineCredential(new LineAccessToken(dVar2.a, dVar2.b, dVar2.c), eVar.b));
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(@NonNull LineLoginResult lineLoginResult) {
            c.this.a.b(lineLoginResult);
        }

        public /* synthetic */ a(c cVar, byte b) {
            this();
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public final void run() {
            c cVar = c.this;
            if (cVar.h.c || cVar.a.isFinishing()) {
                return;
            }
            c.this.a.b(LineLoginResult.CANCEL);
        }

        public /* synthetic */ b(c cVar, byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.c$c, reason: collision with other inner class name */
    public class AsyncTaskC0731c extends AsyncTask<Void, Void, LineApiResponse<f>> {
        private AsyncTaskC0731c() {
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ LineApiResponse<f> doInBackground(@Nullable Void[] voidArr) {
            c cVar = c.this;
            com.linecorp.linesdk.a.a.b bVar = cVar.c;
            String channelId = cVar.b.getChannelId();
            Uri uriBuild = bVar.f.buildUpon().appendPath("oauth").appendPath(DTransferConstants.OTP).build();
            HashMap map = new HashMap(1);
            map.put("client_id", channelId);
            return bVar.g.a(uriBuild, Collections.emptyMap(), map, com.linecorp.linesdk.a.a.b.a);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x010b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0110  */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(@NonNull LineApiResponse<f> lineApiResponse) {
            Intent data;
            Bundle bundle;
            boolean z;
            com.linecorp.linesdk.auth.internal.a.C0730a c0730a;
            boolean z2;
            LineApiResponse<f> lineApiResponse2 = lineApiResponse;
            if (!lineApiResponse2.isSuccess()) {
                c.this.a.b(c.a(lineApiResponse2));
                return;
            }
            f responseData = lineApiResponse2.getResponseData();
            c cVar = c.this;
            cVar.h.a = responseData;
            try {
                com.linecorp.linesdk.auth.internal.a aVar = cVar.e;
                LineAuthenticationActivity lineAuthenticationActivity = cVar.a;
                LineAuthenticationConfig lineAuthenticationConfig = cVar.b;
                String[] strArr = cVar.g;
                byte[] bArr = new byte[8];
                long jNextLong = new SecureRandom().nextLong();
                for (int i = 0; i < 8; i++) {
                    bArr[i] = (byte) jNextLong;
                    jNextLong >>= 8;
                }
                String strEncodeToString = Base64.encodeToString(bArr, 11);
                aVar.a.d = strEncodeToString;
                String str = "intent://result#Intent;package=" + lineAuthenticationActivity.getPackageName() + ";scheme=lineauth;end";
                Uri.Builder builderAppendQueryParameter = lineAuthenticationConfig.getWebLoginPageUrl().buildUpon().appendQueryParameter(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code").appendQueryParameter("client_id", lineAuthenticationConfig.getChannelId()).appendQueryParameter("state", strEncodeToString).appendQueryParameter("otpId", responseData.a).appendQueryParameter("redirect_uri", str);
                if (strArr != null && strArr.length > 0) {
                    builderAppendQueryParameter.appendQueryParameter("scope", TextUtils.join(" ", strArr));
                }
                Uri uriBuild = builderAppendQueryParameter.build();
                boolean zIsLineAppAuthenticationDisabled = lineAuthenticationConfig.isLineAppAuthenticationDisabled();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 16) {
                    CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().setToolbarColor(ContextCompat.getColor(lineAuthenticationActivity, R.color.white)).build();
                    data = customTabsIntentBuild.intent.setData(uriBuild);
                    bundle = customTabsIntentBuild.startAnimationBundle;
                } else {
                    data = new Intent("android.intent.action.VIEW").setData(uriBuild);
                    bundle = null;
                }
                com.linecorp.linesdk.auth.internal.b bVarA = com.linecorp.linesdk.auth.internal.b.a(lineAuthenticationActivity);
                if (bVarA == null) {
                    c0730a = new com.linecorp.linesdk.auth.internal.a.C0730a(data, bundle, false);
                } else {
                    if (zIsLineAppAuthenticationDisabled) {
                        z = false;
                    } else {
                        com.linecorp.linesdk.auth.internal.b bVar = com.linecorp.linesdk.auth.internal.a.b;
                        if (bVar == null) {
                            z2 = false;
                        } else {
                            int i3 = bVarA.a;
                            int i4 = bVar.a;
                            if (i3 == i4) {
                                int i5 = bVarA.b;
                                int i6 = bVar.b;
                                if (i5 != i6) {
                                    if (i5 >= i6) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else if (bVarA.c >= bVar.c) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else if (i3 >= i4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uriBuild);
                        intent.setPackage("jp.naver.line.android");
                        c0730a = new com.linecorp.linesdk.auth.internal.a.C0730a(intent, bundle, true);
                    } else {
                        List<Intent> listA = com.linecorp.linesdk.auth.internal.a.a(uriBuild, lineAuthenticationActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0), data.getExtras());
                        int size = listA.size();
                        if (size == 0) {
                            throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uriBuild);
                        }
                        if (size == 1) {
                            c0730a = new com.linecorp.linesdk.auth.internal.a.C0730a(listA.get(0), bundle, false);
                        } else {
                            Intent intentCreateChooser = Intent.createChooser(listA.remove(0), null);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listA.toArray(new Parcelable[listA.size()]));
                            c0730a = new com.linecorp.linesdk.auth.internal.a.C0730a(intentCreateChooser, bundle, false);
                        }
                    }
                }
                com.linecorp.linesdk.auth.internal.a.b bVar2 = new com.linecorp.linesdk.auth.internal.a.b(c0730a.a, c0730a.b, str, c0730a.c);
                if (bVar2.d) {
                    if (i2 >= 16) {
                        c.this.a.startActivity(bVar2.a, bVar2.b);
                    } else {
                        c.this.a.startActivity(bVar2.a);
                    }
                } else if (i2 >= 16) {
                    c.this.a.startActivityForResult(bVar2.a, 3, bVar2.b);
                } else {
                    c.this.a.startActivityForResult(bVar2.a, 3);
                }
                c.this.h.b = bVar2.c;
            } catch (ActivityNotFoundException e) {
                c.this.a.b(new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(e)));
            }
        }

        public /* synthetic */ AsyncTaskC0731c(c cVar, byte b) {
            this();
        }
    }

    public c(@NonNull LineAuthenticationActivity lineAuthenticationActivity, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull d dVar, @Nullable String[] strArr) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new com.linecorp.linesdk.a.a.b(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getEndPointBaseUrl()), new com.linecorp.linesdk.a.a.d(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getEndPointBaseUrl()), new com.linecorp.linesdk.auth.internal.a(dVar), new com.linecorp.linesdk.a.a(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getChannelId()), dVar, strArr);
    }

    public static /* synthetic */ LineLoginResult a(LineApiResponse lineApiResponse) {
        return new LineLoginResult(lineApiResponse.getResponseCode(), lineApiResponse.getErrorData());
    }

    @VisibleForTesting
    private c(@NonNull LineAuthenticationActivity lineAuthenticationActivity, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull com.linecorp.linesdk.a.a.b bVar, @NonNull com.linecorp.linesdk.a.a.d dVar, @NonNull com.linecorp.linesdk.auth.internal.a aVar, @NonNull com.linecorp.linesdk.a.a aVar2, @NonNull d dVar2, @Nullable String[] strArr) {
        this.a = lineAuthenticationActivity;
        this.b = lineAuthenticationConfig;
        this.c = bVar;
        this.d = dVar;
        this.e = aVar;
        this.f = aVar2;
        this.h = dVar2;
        this.g = strArr;
    }
}
