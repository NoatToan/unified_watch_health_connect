package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.router.RouterActionCallBack;
import com.huawei.wear.oversea.router.RouterRequest;
import com.huawei.wear.oversea.router.WalletAction;
import com.huawei.wear.oversea.router.WalletProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes20.dex */
public class xof {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xof f53230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f53231c = new byte[0];
    private Map<String, WalletProvider> e = new HashMap();

    private xof() {
    }

    public static xof c() {
        if (f53230b == null) {
            synchronized (f53231c) {
                if (f53230b == null) {
                    f53230b = new xof();
                }
            }
        }
        return f53230b;
    }

    public xoe c(RouterRequest routerRequest, RouterActionCallBack routerActionCallBack) {
        xnd.c("LocalRouter", "Invoke action  " + routerRequest.e(), false);
        WalletAction walletActionB = b(routerRequest);
        if (walletActionB == null) {
            xnd.c("LocalRouter", "Action not found  action " + routerRequest.e(), false);
            return new xoe("99998", "Action not found,action:" + routerRequest.e());
        }
        xoe xoeVar = new xoe();
        xoh xohVar = new xoh(routerRequest.b(), routerRequest.d());
        if (routerActionCallBack == null || !walletActionB.isAsync(routerRequest.c(), xohVar)) {
            xnd.c("LocalRouter", "Sync invoke action " + routerRequest.e(), false);
            xoeVar.d(false);
            xoj xojVarInvoke = walletActionB.invoke(routerRequest.c(), xohVar);
            xoeVar.a(xojVarInvoke.b());
            xoeVar.b(xojVarInvoke.d());
            return xoeVar;
        }
        xnd.c("LocalRouter", "ASync invoke action " + routerRequest.e(), false);
        xoeVar.d(true);
        Future futureSubmit = xpd.e().a().submit(new b(routerActionCallBack, xoeVar, xohVar, routerRequest.c(), walletActionB));
        if (futureSubmit != null && futureSubmit.isDone()) {
            xnd.c("LocalRouter", "LocalTask is done", false);
        }
        return xoeVar;
    }

    private String a(RouterRequest routerRequest) {
        return " ";
    }

    private WalletAction b(RouterRequest routerRequest) {
        String strA = a(routerRequest);
        WalletProvider walletProvider = this.e.get(strA + ":" + routerRequest.a());
        WalletProvider walletProvider2 = this.e.get(routerRequest.a());
        if (walletProvider == null && walletProvider2 == null) {
            xnd.c("LocalRouter", "Provider not found  provider" + routerRequest.a(), false);
            return null;
        }
        WalletAction walletActionFindAction = walletProvider != null ? walletProvider.findAction(routerRequest.b()) : null;
        if (walletActionFindAction == null) {
            walletActionFindAction = walletProvider2.findAction(routerRequest.b());
        }
        if (walletActionFindAction == null) {
            xnd.c("LocalRouter", "Action not found action" + routerRequest.b(), false);
        }
        return walletActionFindAction;
    }

    static class b implements Callable<xoe> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WalletAction f53232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private xoh f53233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private xoe f53234c;
        private Context d;
        private RouterActionCallBack e;

        public b(RouterActionCallBack routerActionCallBack, xoe xoeVar, xoh xohVar, Context context, WalletAction walletAction) {
            this.d = context;
            this.f53234c = xoeVar;
            this.f53233b = xohVar;
            this.f53232a = walletAction;
            this.e = routerActionCallBack;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public xoe call() throws Exception {
            xoj xojVarInvoke = this.f53232a.invoke(this.d, this.f53233b);
            this.f53234c.a(xojVarInvoke.a());
            this.f53234c.d(xojVarInvoke.e());
            if (xojVarInvoke.b()) {
                xnd.c("LocalRouter", "ASync invoke action " + this.f53233b.e() + " success!", false);
                this.e.onSuccess(this.f53234c);
            } else {
                xnd.c("LocalRouter", "ASync invoke action " + this.f53233b.e() + " failed, resultCode " + xojVarInvoke.a() + " resultDesc " + xojVarInvoke.e(), false);
                this.e.onFail(this.f53234c);
            }
            return this.f53234c;
        }
    }
}
