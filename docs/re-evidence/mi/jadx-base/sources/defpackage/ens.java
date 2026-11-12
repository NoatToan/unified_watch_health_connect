package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ens {

    public class a extends b5t {
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: ens$a$a, reason: collision with other inner class name */
        public class BinderC0924a extends IDigitalKeyCallback.Stub {
            public BinderC0924a() {
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onError(int i) throws RemoteException {
                a.this.f(i);
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onResult(Bundle bundle) throws RemoteException {
                a.this.f(0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            super(context);
            this.e = str;
        }

        @Override // defpackage.b5t
        public void d(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException {
            iDigitalKeyFramework.terminateDigitalKey(this.e, new BinderC0924a());
        }
    }

    public class b extends b5t {
        public final /* synthetic */ Uri e;

        public class a extends IDigitalKeyCallback.Stub {
            public a() {
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onError(int i) throws RemoteException {
                LogUtils.d("confirmDigitalKeySharing error " + i);
                b.this.f(i);
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onResult(Bundle bundle) throws RemoteException {
                LogUtils.d("confirmDigitalKeySharing success");
                b.this.f(0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Uri uri) {
            super(context);
            this.e = uri;
        }

        @Override // defpackage.b5t
        public void d(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException {
            iDigitalKeyFramework.confirmDigitalKeySharing(this.e, new a());
        }
    }

    public class c extends b5t {
        public final /* synthetic */ String e;

        public class a extends IDigitalKeyCallback.Stub {
            public a() {
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onError(int i) throws RemoteException {
                LogUtils.d("importEndpointData error " + i);
                c.this.f(i);
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onResult(Bundle bundle) throws RemoteException {
                LogUtils.d("importEndpointData success");
                c.this.c(0, bundle.getString(IDigitalKeyCallback.EXTRA_STR, "").toUpperCase(Locale.ROOT));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str) {
            super(context);
            this.e = str;
        }

        @Override // defpackage.b5t
        public void d(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException {
            iDigitalKeyFramework.startRedeemSharing(this.e, new a());
        }
    }

    public class d extends b5t {
        public final /* synthetic */ String e;

        public class a extends IDigitalKeyCallback.Stub {
            public a() {
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onError(int i) throws RemoteException {
                LogUtils.d("query importEndpointData error " + i);
                d.this.f(i);
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onResult(Bundle bundle) throws RemoteException {
                LogUtils.d("query importEndpointData success");
                d.this.f(0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str) {
            super(context);
            this.e = str;
        }

        @Override // defpackage.b5t
        public void d(IDigitalKeyFramework iDigitalKeyFramework) throws RemoteException {
            iDigitalKeyFramework.queryImportRequest(this.e, new a());
        }
    }

    public BaseResponse a(Context context, Uri uri) {
        return new b(context, uri).e();
    }

    public BaseResponse b(Context context, String str) {
        try {
            mas masVar = new mas(context, "CAR_KEY_WEARABLE_ACCEPT_SHARING", SDKConstants.KEY_CCC + str, null);
            HttpClient.getInstance(context).execute(masVar);
            return !masVar.isSuccess() ? new BaseResponse(ErrorCode.ERROR_CODE_DIGITAL_KEY_SHARE_NOT_SUPPORTED, new Object[0]) : new BaseResponse(0, new Object[0]);
        } catch (InternalIOException unused) {
            return new BaseResponse(14, new Object[0]);
        } catch (IOException unused2) {
            return new BaseResponse(12, new Object[0]);
        }
    }

    public BaseResponse c(Context context, String str, String str2, List<String> list) {
        try {
            if (ObjectUtils.isCollectionEmpty(list)) {
                return new BaseResponse(-1, new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                mas masVar = new mas(context, "CAR_KEY_WEARABLE_ACCEPT_SHARING", str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2, list.get(i), null);
                Response responseExecute = HttpClient.getInstance(context).execute(masVar);
                if (masVar.isSuccess()) {
                    arrayList.add(list.get(i));
                } else if (!responseExecute.isHttpRequestSuccessful()) {
                    return new BaseResponse(-1, new Object[0]);
                }
            }
            return new BaseResponse(0, arrayList);
        } catch (InternalIOException unused) {
            return new BaseResponse(14, new Object[0]);
        } catch (IOException unused2) {
            return new BaseResponse(12, new Object[0]);
        }
    }

    public BaseResponse d(Context context, String str) {
        return TextUtils.isEmpty(str) ? new BaseResponse(22003, new Object[0]) : new c(context, str).e();
    }

    public BaseResponse e(Context context, String str) {
        return TextUtils.isEmpty(str) ? new BaseResponse(22003, new Object[0]) : new d(context, str).e();
    }

    public BaseResponse f(Context context, String str) {
        return TextUtils.isEmpty(str) ? new BaseResponse(22003, new Object[0]) : new a(context, str).e();
    }
}
