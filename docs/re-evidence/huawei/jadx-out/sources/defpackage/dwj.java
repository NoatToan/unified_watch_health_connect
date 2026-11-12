package defpackage;

import android.content.Context;
import com.huawei.health.device.ui.measure.service.ServiceForDatabaseManager;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dwj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f32452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceForDatabaseManager f32453a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final dwj f32454a = new dwj();
    }

    private dwj() {
        this.f32453a = new ServiceForDatabaseManager(f32452c);
    }

    public static dwj d(Context context) {
        LogUtil.a("OpenServiceController", "getInstance");
        f32452c = context.getApplicationContext();
        return a.f32454a;
    }

    public List<dwk> a() {
        return this.f32453a.c();
    }
}
