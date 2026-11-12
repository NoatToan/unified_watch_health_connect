package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mns extends Model implements ILifeCycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f27036b;

    public interface a {
        void a(int i, String str);

        void a(Bundle bundle);

        void d(nes<Activity> nesVar);
    }

    public mns(Session session, String str) {
        super(session);
        this.f27035a = str;
    }

    public a a() {
        return this.f27036b;
    }

    public void b(a aVar) {
        this.f27036b = aVar;
    }

    public String c() {
        return this.f27035a;
    }

    public void d() {
    }

    public abstract void e();

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onPause() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onResume() {
    }
}
