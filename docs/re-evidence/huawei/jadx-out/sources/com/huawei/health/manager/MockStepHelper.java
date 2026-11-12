package com.huawei.health.manager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.common.Constant;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.mockhealth.IMockStepReport;
import com.huawei.mockhealth.IMockStepService;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.Base64;
import health.compact.a.StandStepCounter;
import health.compact.a.StepCounterSupport;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class MockStepHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MyMockServiceConnection f8061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MyCallback f8062c;
    private ExtendStepCounter f;
    private IMockStepService g;
    private StandStepCounter h;
    private final Object d = new Object();
    private int e = 0;
    private volatile boolean j = false;

    public MockStepHelper(Context context) {
        this.f8061b = new MyMockServiceConnection();
        this.f8062c = new MyCallback();
        this.f8060a = context;
    }

    public boolean b() {
        SecurityException e;
        boolean zBindService;
        InterruptedException e2;
        Intent intent = new Intent();
        intent.setPackage("com.huawei.mockhealth");
        intent.setClassName("com.huawei.mockhealth", "com.huawei.mockhealth.MockStepService");
        try {
            zBindService = this.f8060a.bindService(intent, this.f8061b, 1);
            try {
                synchronized (this.d) {
                    try {
                        this.d.wait(5000L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e3) {
                e2 = e3;
                LogUtil.e("Step_Mock", "bindMockStepService InterruptedException: ", e2.toString());
            } catch (SecurityException e4) {
                e = e4;
                LogUtil.e("Step_Mock", "bindMockStepService SecurityException: ", e.toString());
            }
        } catch (InterruptedException e5) {
            e2 = e5;
            zBindService = false;
        } catch (SecurityException e6) {
            e = e6;
            zBindService = false;
        }
        LogUtil.a("Step_Mock", "MockService isBind: ", Boolean.valueOf(zBindService));
        return this.g != null;
    }

    public void c(StandStepCounter standStepCounter, ExtendStepCounter extendStepCounter) {
        this.h = standStepCounter;
        this.f = extendStepCounter;
    }

    public void a() {
        MyCallback myCallback;
        IMockStepService iMockStepService = this.g;
        if (iMockStepService == null || (myCallback = this.f8062c) == null) {
            return;
        }
        try {
            iMockStepService.registerMockStepReport(myCallback);
        } catch (RemoteException e) {
            LogUtil.e("Step_Mock", e.getMessage());
        }
    }

    class MyMockServiceConnection implements ServiceConnection {
        private MyMockServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.a("Step_Mock", "MockService disconnected");
            MockStepHelper.this.j = false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.a("Step_Mock", Constant.SERVICE_CONNECT_MESSAGE, componentName);
            if (componentName == null || !"com.huawei.mockhealth.MockStepService".equals(componentName.getClassName())) {
                return;
            }
            MockStepHelper.this.j = true;
            MockStepHelper.this.g = IMockStepService.Stub.asInterface(iBinder);
            try {
                MockStepHelper mockStepHelper = MockStepHelper.this;
                mockStepHelper.c(mockStepHelper.g.getCapacity());
            } catch (RemoteException e) {
                LogUtil.e("Step_Mock", e.getMessage());
            }
            MockStepHelper.this.a();
            synchronized (MockStepHelper.this.d) {
                MockStepHelper.this.d.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.e = i;
        LogUtil.a("Step_Mock", "updateCapacity: capacity = ", Integer.valueOf(i));
        if ((i & 1) != 1) {
            StepCounterSupport.b(this.f8060a, 3);
        } else if ((i & 2) == 2) {
            StepCounterSupport.b(this.f8060a, 1);
        } else {
            StepCounterSupport.b(this.f8060a, 2);
        }
    }

    public boolean c() {
        return (this.e & 1) == 1;
    }

    class MyCallback extends IMockStepReport.Stub {
        private MyCallback() {
        }

        @Override // com.huawei.mockhealth.IMockStepReport
        public void onExtendStepChanged(Bundle bundle) throws RemoteException {
            if (MockStepHelper.this.j) {
                if (bundle == null || MockStepHelper.this.f == null) {
                    return;
                }
                long j = bundle.getLong("start_time");
                try {
                    MockStepHelper.this.f.dataReport(MockStepHelper.this.f8060a, j, bundle.getIntArray(MedalConstants.EVENT_STEPS), bundle.getIntArray("floors"), bundle.getIntArray(ContentTemplateRecord.MOTIONS));
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    LogUtil.e("Step_Mock", e.getMessage());
                    return;
                }
            }
            LogUtil.e("Step_Mock", "onExtendStepChanged bind service is disconnect");
        }

        @Override // com.huawei.mockhealth.IMockStepReport
        public void onStandStepChanged(int i) throws RemoteException {
            if (MockStepHelper.this.j) {
                if (MockStepHelper.this.h != null) {
                    MockStepHelper.this.h.c(i, 2);
                    return;
                }
                return;
            }
            LogUtil.e("Step_Mock", "onStandStepChanged bind service is disconnect");
        }
    }

    private static boolean d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        StringBuilder sb = new StringBuilder(16);
        try {
            for (Signature signature : packageManager.getPackageInfo(str, 64).signatures) {
                sb.append(signature.toCharsString());
            }
            return "MzA4MjA0YjUzMDgyMDM5ZGEwMDMwMjAxMDIwMjA5MDBmMjA0NTZhYjk2NGZhMGYwMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMzA4MTk4MzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzExMjMwMTAwNjAzNTUwNDA3MTMwOTUzNjg2NTZlNjc3YTY4NjU2ZTMxMGYzMDBkMDYwMzU1MDQwYTEzMDY0ODc1NjE3NzY1NjkzMTE4MzAxNjA2MDM1NTA0MGIxMzBmNTQ2NTcyNmQ2OTZlNjE2YzQzNmY2ZDcwNjE2ZTc5MzExNDMwMTIwNjAzNTUwNDAzMTMwYjQxNmU2NDcyNmY2OTY0NTQ2NTYxNmQzMTIwMzAxZTA2MDkyYTg2NDg4NmY3MGQwMTA5MDExNjExNmQ2ZjYyNjk2YzY1NDA2ODc1NjE3NzY1NjkyZTYzNmY2ZDMwMWUxNzBkMzEzMTMwMzUzMjM1MzAzNjMxMzAzNDM5NWExNzBkMzMzNjMwMzUzMTM4MzAzNjMxMzAzNDM5NWEzMDgxOTgzMTBiMzAwOTA2MDM1NTA0MDYxMzAyNDM0ZTMxMTIzMDEwMDYwMzU1MDQwODEzMDk0Nzc1NjE2ZTY3NjQ2ZjZlNjczMTEyMzAxMDA2MDM1NTA0MDcxMzA5NTM2ODY1NmU2NzdhNjg2NTZlMzEwZjMwMGQwNjAzNTUwNDBhMTMwNjQ4NzU2MTc3NjU2OTMxMTgzMDE2MDYwMzU1MDQwYjEzMGY1NDY1NzI2ZDY5NmU2MTZjNDM2ZjZkNzA2MTZlNzkzMTE0MzAxMjA2MDM1NTA0MDMxMzBiNDE2ZTY0NzI2ZjY5NjQ1NDY1NjE2ZDMxMjAzMDFlMDYwOTJhODY0ODg2ZjcwZDAxMDkwMTE2MTE2ZDZmNjI2OTZjNjU0MDY4NzU2MTc3NjU2OTJlNjM2ZjZkMzA4MjAxMjAzMDBkMDYwOTJhODY0ODg2ZjcwZDAxMDEwMTA1MDAwMzgyMDEwZDAwMzA4MjAxMDgwMjgyMDEwMTAwZTAyYzVhYjk3YTJiM2E4YTU5OTYyMjNjZGUwNmI4MmIyZDRmZjViMTVjYWY2NWI4NjBkNWM3YTNkNjg5OTVhYjA4NjIwYmI3NWEyMmZlNzY3M2E4YTFhYmEwM2UxN2I2NTFkMWZjNGQ1Y2JkYmFlOWU3M2VlZWFmNWExZDRkMmZiNzNlNzAwMDIzMWUwZGIyMTY2ZDBmYzVkZDk3ZTcwNWZkNjY1NDZjOWRhMzhlZDRlZmEyY2NjZGQyMzhhZDMyZTM5ODIxMjQyYjAxOTVkZjAxZDliOTcyNDJkYmYyMDllZGE4ZTQ0NmUwNDMyNDRiODRlNmJmY2E3OWQ3YmIzYzE5MjRjZGQyNDhlZGJkNjAwZWZmOGY3MzAwMWE4OWE0YzY2M2RiODk3MGUzMjg4Yjk0MzE1MjRjMzYxZTg1M2I4ZmEyOWUwNGU2MWViZTZmYmRiZDg3Y2RiZDNlZWI0N2IwMjdiNTg1MWJkZWFhMTNhMjNmNDM5NjdhMDMwZTc0N2VhNDMyNjUyY2JiMzRmZGRlNjEwNDliZjUwNjBjODEzZmIwZTkzZjZiYWQ5ZDM2ZjRkNDU1MTE5NWVhM2JiNDllOTIwMWFhNmRmOTc1YWUxNjllMjE0OTA1ZGUyNTc5ZDdjYzNjM2VhYzQ1OTRiMTRhYzE5ZDdlMzljNWMyNjcwMjAxMDNhMzgyMDEwMDMwODFmZDMwMWQwNjAzNTUxZDBlMDQxNjA0MTQzZWM2OTBkZTgxMWJjMzllNTFhMzAzMDFhZDIzY2YzMDA2ZDY3ZGUwMzA4MWNkMDYwMzU1MWQyMzA0ODFjNTMwODFjMjgwMTQzZWM2OTBkZTgxMWJjMzllNTFhMzAzMDFhZDIzY2YzMDA2ZDY3ZGUwYTE4MTllYTQ4MTliMzA4MTk4MzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzExMjMwMTAwNjAzNTUwNDA3MTMwOTUzNjg2NTZlNjc3YTY4NjU2ZTMxMGYzMDBkMDYwMzU1MDQwYTEzMDY0ODc1NjE3NzY1NjkzMTE4MzAxNjA2MDM1NTA0MGIxMzBmNTQ2NTcyNmQ2OTZlNjE2YzQzNmY2ZDcwNjE2ZTc5MzExNDMwMTIwNjAzNTUwNDAzMTMwYjQxNmU2NDcyNmY2OTY0NTQ2NTYxNmQzMTIwMzAxZTA2MDkyYTg2NDg4NmY3MGQwMTA5MDExNjExNmQ2ZjYyNjk2YzY1NDA2ODc1NjE3NzY1NjkyZTYzNmY2ZDgyMDkwMGYyMDQ1NmFiOTY0ZmEwZjAzMDBjMDYwMzU1MWQxMzA0MDUzMDAzMDEwMWZmMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMDM4MjAxMDEwMDZkYWQyZmM1OTBjZjAwNzlhYzRjZTA4NjVhODg0MzExZGMxNmFkODMyNzVhMmIwMzAyNDA1Nzc2ZGQxZDFmNzA0YTI5OTkzYzhhMTM0YThkZmRkNTRjNTkxNTFhMDYxNTU2MTJkYmQzMDA2NDZlYWNmYzlmNjRmYWMyZTM1MjcwOWIwMzU5Zjc1NmFmOTZjMWY1NjQ5NTMwNGU3MjI4N2JlNDc5OGEwNDMzMzU2Y2JjY2RkOGQ1N2NkZTFmN2ZmMWMwMDRjYjk2MmFkNTk1YjFkYTIyZWYyMDRkZTE0NDkwODg2MWJiYTk2OGUwYzc0MzgxZTExOWM3NzJiMmNmMjJjM2QwYzgzMjVhOWYzMWM5Nzg3YjE1NmM5NDc3MWFmNjZmNGZmYjFhZDk5NmMzZmJlNzY0ZjNiYzUwYjdhMjY0M2MyMzM3MjYxMmYyNTA5OTQ2YTAzYmFkZmJmZWE2MWY4ZTNkMjg5MjMzODViYmMwMDg3NWFjZWM5OWI2ZDkyYWM0NjhmMGRjNTBjMDk5N2ZmNDA5ZTNhMjVkYzhkOTY2YzIwZDU4OGE5NzEzZmYyMTdlMmRlNDk0NTdhMzJjZjIzZGYxYWY1OGY0YmNkZDk0YThmMjZiYzFjOTBjNWE1MTgzZGI2NGQ0NjM1M2RkNDYxMDQ3OGM3N2YyYzg5OTg4".equals(Base64.b(sb.toString().getBytes("UTF-8")));
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("Step_Mock", e.getMessage());
            return false;
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("Step_Mock", e2.getMessage());
            return false;
        }
    }

    public static boolean c(Context context) {
        if (!StepCounterSupport.d(context)) {
            LogUtil.a("Step_Mock", "isSupportMockStepCounter false ");
            return false;
        }
        if (context != null) {
            return d(context, "com.huawei.mockhealth");
        }
        return false;
    }
}
