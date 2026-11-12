package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.SecureConnectOptions;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;

/* JADX INFO: loaded from: classes5.dex */
public class g23 extends BluetoothContextManager {

    public class a implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f18486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18487b;

        public a(IBleSecureConnectResponse iBleSecureConnectResponse, String str) {
            this.f18486a = iBleSecureConnectResponse;
            this.f18487b = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18486a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18486a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18486a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f18487b);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18486a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public class b implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f18488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18489b;

        public b(IBleSecureConnectResponse iBleSecureConnectResponse, String str) {
            this.f18488a = iBleSecureConnectResponse;
            this.f18489b = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18488a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18488a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18488a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f18489b);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18488a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public class c implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f18490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18491b;

        public c(IBleSecureConnectResponse iBleSecureConnectResponse, String str) {
            this.f18490a = iBleSecureConnectResponse;
            this.f18491b = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18490a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18490a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18490a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f18491b);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18490a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public class d implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f18492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18493b;

        public d(IBleSecureConnectResponse iBleSecureConnectResponse, String str) {
            this.f18492a = iBleSecureConnectResponse;
            this.f18493b = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18492a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18492a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18492a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f18493b);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18492a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public class e implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBleSecureConnectResponse f18494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18495b;

        public e(IBleSecureConnectResponse iBleSecureConnectResponse, String str) {
            this.f18494a = iBleSecureConnectResponse;
            this.f18495b = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = bundle != null ? bundle.toString() : null;
            BluetoothMyLogger.d(String.format("BluetoothHelper bleStandardAuthConnect onAuthResponse code %d, bundle %s", objArr));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18494a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = bundle != null ? bundle.toString() : null;
            BluetoothMyLogger.d(String.format("BluetoothHelper bleStandardAuthConnect onBindResponse code %d, bundle %s", objArr));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18494a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = bundle != null ? bundle.toString() : null;
            BluetoothMyLogger.d(String.format("BluetoothHelper bleStandardAuthConnect onConnectResponse code %d, bundle %s", objArr));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18494a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = bundle != null ? bundle.toString() : null;
            BluetoothMyLogger.d(String.format("BluetoothHelper bleStandardAuthConnect onLastResponse ,code %d, bundle %s", objArr));
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f18495b);
                intent.putExtra("extra_online_status", 80);
                intent.putExtra(BluetoothConstants.IS_STANDARD_AUTH_DEVICE, true);
                BluetoothUtils.sendBroadcast(intent);
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.f18494a;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public class f implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f18496a;

        public f(Response.BleConnectResponse bleConnectResponse) {
            this.f18496a = bleConnectResponse;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            Response.BleConnectResponse bleConnectResponse = this.f18496a;
            if (bleConnectResponse != null) {
                bleConnectResponse.onResponse(i, bundle);
            }
        }
    }

    public static void a(String str, String str2, String str3, Response.BleConnectResponse bleConnectResponse) {
        BleSecureConnectManager.bleMeshConnect(str, str2, str3, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(2).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new f(bleConnectResponse));
    }

    public static ISecureConnectHandler b(String str, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        SecureConnectOptions secureConnectOptionsBuild = new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptions).build();
        Object[] objArr = new Object[2];
        objArr[0] = nq2.a(str);
        objArr[1] = bleConnectOptions != null ? bleConnectOptions.toString() : null;
        BluetoothMyLogger.d(String.format("BluetoothHelper bleStandardAuthConnect model = %s, connectionOptions %s", objArr));
        return BleSecureConnectManager.bleStandardAuthConnect(str, secureConnectOptionsBuild, new e(iBleSecureConnectResponse, str));
    }

    public static ISecureConnectHandler c(String str, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        return BleSecureConnectManager.secureConnect(str, new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptions).build(), new a(iBleSecureConnectResponse, str));
    }

    public static ISecureConnectHandler d(String str, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        return BleSecureConnectManager.securityChipConnect(str, new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptions).build(), new b(iBleSecureConnectResponse, str));
    }

    public static ISecureConnectHandler e(String str, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        return BleSecureConnectManager.securityChipSharedDeviceConnect(str, new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptions).build(), new c(iBleSecureConnectResponse, str));
    }

    public static ISecureConnectHandler f(String str, String str2, BleConnectOptions bleConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        return BleSecureConnectManager.securityDoubleFactorSharedDeviceConnect(str, str2, new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptions).build(), new d(iBleSecureConnectResponse, str));
    }
}
