package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;

/* JADX INFO: loaded from: classes5.dex */
public abstract class izs extends Model implements ILifeCycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f22264b;

    public interface a {
        void a(int i, String str);

        void a(Bundle bundle);

        void f(xrs<Activity> xrsVar);
    }

    public izs(Session session, String str) {
        super(session);
        this.f22263a = str;
    }

    public a a() {
        return this.f22264b;
    }

    public void b(a aVar) {
        this.f22264b = aVar;
    }

    public String c() {
        return this.f22263a;
    }

    public abstract void d();

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
    }

    public void onDestroy() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onPause() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onResume() {
    }
}
