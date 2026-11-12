package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.procedure.AccountPhoneNumberSourceFlag;
import com.xiaomi.phonenum.utils.ServiceBindWaiter;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class f5g implements roc {

    public class a extends toc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AccountCertification[][] f17425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f17426b;
        public final /* synthetic */ AccountCertification[] c;

        public a(AccountCertification[][] accountCertificationArr, CountDownLatch countDownLatch, AccountCertification[] accountCertificationArr2) {
            this.f17425a = accountCertificationArr;
            this.f17426b = countDownLatch;
            this.c = accountCertificationArr2;
        }

        @Override // defpackage.toc
        public void onError(int i, String str) throws RemoteException {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "onError code=" + i + ", desc=" + str);
            this.f17425a[0] = this.c;
            this.f17426b.countDown();
        }

        @Override // defpackage.toc
        public void onResult(Bundle bundle) throws RemoteException {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "onResult" + bundle.toString());
            bundle.setClassLoader(AccountCertification.class.getClassLoader());
            Parcelable[] parcelableArray = bundle.getParcelableArray("account_certification_array");
            this.f17425a[0] = new AccountCertification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                this.f17425a[0][i] = (AccountCertification) parcelableArray[i];
            }
            this.f17426b.countDown();
        }
    }

    public class b extends toc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SIMInfo[][] f17427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f17428b;
        public final /* synthetic */ SIMInfo[] c;

        public b(SIMInfo[][] sIMInfoArr, CountDownLatch countDownLatch, SIMInfo[] sIMInfoArr2) {
            this.f17427a = sIMInfoArr;
            this.f17428b = countDownLatch;
            this.c = sIMInfoArr2;
        }

        @Override // defpackage.toc
        public void onError(int i, String str) throws RemoteException {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "onError code=" + i + ", desc=" + str);
            this.f17427a[0] = this.c;
            this.f17428b.countDown();
        }

        @Override // defpackage.toc
        public void onResult(Bundle bundle) throws RemoteException {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "onResult");
            bundle.setClassLoader(SIMInfo.class.getClassLoader());
            Parcelable[] parcelableArray = bundle.getParcelableArray("sim_info_array");
            this.f17427a[0] = new SIMInfo[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                this.f17427a[0][i] = (SIMInfo) parcelableArray[i];
            }
            this.f17428b.countDown();
        }
    }

    public static Intent d() {
        Intent intent = new Intent("com.xiaomi.phonenum.ACCOUNT_PHONE_NUMBER_MANAGER_BIND_SERVICE");
        intent.setPackage("com.xiaomi.account");
        return intent;
    }

    public static boolean e(Context context) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(d(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    @Override // defpackage.roc
    public AccountCertification[] a(Context context, String str, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag) {
        AccountLogger.log("MiuiAccountPhoneNumberManager", "call getAccountCertifications sid=" + str);
        AccountCertification[] accountCertificationArr = new AccountCertification[pth.g(context).getPhoneCount()];
        ServiceBindWaiter.b bVar = null;
        try {
            try {
                ServiceBindWaiter.b bVarA = ServiceBindWaiter.a(context, d());
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AccountCertification[][] accountCertificationArr2 = new AccountCertification[1][];
                soc.a.s2(bVarA.f14026b).K(str, context.getPackageName(), accountPhoneNumberSourceFlag.f14017a, new a(accountCertificationArr2, countDownLatch, accountCertificationArr), "account_certification_array");
                if (!countDownLatch.await(1L, TimeUnit.MINUTES)) {
                    AccountLogger.log("MiuiAccountPhoneNumberManager", "getAccountCertifications timeout");
                    bVarA.a(context);
                    return accountCertificationArr;
                }
                AccountLogger.log("MiuiAccountPhoneNumberManager", "getAccountCertifications succeed");
                AccountCertification[] accountCertificationArr3 = accountCertificationArr2[0];
                bVarA.a(context);
                return accountCertificationArr3;
            } catch (Throwable th) {
                if (0 != 0) {
                    bVar.a(context);
                }
                throw th;
            }
        } catch (RemoteException | ServiceBindWaiter.ServiceBindFailedException | ServiceBindWaiter.ServiceBindTimeoutException | InterruptedException e) {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "getAccountCertifications failed", e);
            if (0 != 0) {
                bVar.a(context);
            }
            return accountCertificationArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    @Override // defpackage.roc
    public SIMInfo[] b(Context context, String str, String[] strArr) throws Throwable {
        AccountLogger.log("MiuiAccountPhoneNumberManager", "call getSIMInfos sid=" + str + ", simInfoTypes=" + String.join(",", strArr));
        SIMInfo[] sIMInfoArr = new SIMInfo[pth.g(context).getPhoneCount()];
        ServiceBindWaiter.b bVar = null;
        try {
            ServiceBindWaiter.b bVarA = ServiceBindWaiter.a(context, d());
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                SIMInfo[][] sIMInfoArr2 = new SIMInfo[1][];
                try {
                    soc.a.s2(bVarA.f14026b).I0(str, context.getPackageName(), strArr, new b(sIMInfoArr2, countDownLatch, sIMInfoArr), "sim_info_array");
                    if (!countDownLatch.await(1L, TimeUnit.MINUTES)) {
                        AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos timeout");
                        bVarA.a(context);
                        return sIMInfoArr;
                    }
                    AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos succeed");
                    SIMInfo[] sIMInfoArr3 = sIMInfoArr2[0];
                    bVarA.a(context);
                    return sIMInfoArr3;
                } catch (RemoteException e) {
                    e = e;
                    bVar = bVarA;
                    try {
                        AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                        if (bVar != null) {
                            bVar.a(context);
                        }
                        return new SIMInfo[0];
                    } catch (Throwable th) {
                        th = th;
                        if (bVar != null) {
                            bVar.a(context);
                        }
                        throw th;
                    }
                } catch (ServiceBindWaiter.ServiceBindFailedException e2) {
                    e = e2;
                    bVar = bVarA;
                    AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                    if (bVar != null) {
                        bVar.a(context);
                    }
                    return new SIMInfo[0];
                } catch (ServiceBindWaiter.ServiceBindTimeoutException e3) {
                    e = e3;
                    bVar = bVarA;
                    AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                    if (bVar != null) {
                        bVar.a(context);
                    }
                    return new SIMInfo[0];
                } catch (InterruptedException e4) {
                    e = e4;
                    bVar = bVarA;
                    AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                    if (bVar != null) {
                        bVar.a(context);
                    }
                    return new SIMInfo[0];
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVarA;
                    if (bVar != null) {
                        bVar.a(context);
                    }
                    throw th;
                }
            } catch (RemoteException e5) {
                e = e5;
                bVar = bVarA;
                AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                if (bVar != null) {
                    bVar.a(context);
                }
                return new SIMInfo[0];
            } catch (ServiceBindWaiter.ServiceBindFailedException e6) {
                e = e6;
                bVar = bVarA;
                AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                if (bVar != null) {
                    bVar.a(context);
                }
                return new SIMInfo[0];
            } catch (ServiceBindWaiter.ServiceBindTimeoutException e7) {
                e = e7;
                bVar = bVarA;
                AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                if (bVar != null) {
                    bVar.a(context);
                }
                return new SIMInfo[0];
            } catch (InterruptedException e8) {
                e = e8;
                bVar = bVarA;
                AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
                if (bVar != null) {
                    bVar.a(context);
                }
                return new SIMInfo[0];
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (RemoteException e9) {
            e = e9;
            AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
            if (bVar != null) {
                bVar.a(context);
            }
            return new SIMInfo[0];
        } catch (ServiceBindWaiter.ServiceBindFailedException e10) {
            e = e10;
            AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
            if (bVar != null) {
                bVar.a(context);
            }
            return new SIMInfo[0];
        } catch (ServiceBindWaiter.ServiceBindTimeoutException e11) {
            e = e11;
            AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
            if (bVar != null) {
                bVar.a(context);
            }
            return new SIMInfo[0];
        } catch (InterruptedException e12) {
            e = e12;
            AccountLogger.log("MiuiAccountPhoneNumberManager", "getSIMInfos failed", e);
            if (bVar != null) {
                bVar.a(context);
            }
            return new SIMInfo[0];
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.roc
    public void c(Context context, String str, AccountCertification accountCertification) {
        AccountLogger.log("MiuiAccountPhoneNumberManager", "call invalidateAccountCertification sid=" + str + ", accountCertification=" + accountCertification);
        ServiceBindWaiter.b bVarA = null;
        try {
            try {
                bVarA = ServiceBindWaiter.a(context, d());
                AccountLogger.log("MiuiAccountPhoneNumberManager", "invalidateAccountCertification errorCode=" + soc.a.s2(bVarA.f14026b).Y3(str, context.getPackageName(), accountCertification));
            } catch (Throwable th) {
                if (bVarA != null) {
                    bVarA.a(context);
                }
                throw th;
            }
        } catch (RemoteException | ServiceBindWaiter.ServiceBindFailedException | ServiceBindWaiter.ServiceBindTimeoutException | InterruptedException e) {
            AccountLogger.log("MiuiAccountPhoneNumberManager", "invalidateAccountCertification failed", e);
            if (bVarA == null) {
                return;
            }
        }
        bVarA.a(context);
    }
}
