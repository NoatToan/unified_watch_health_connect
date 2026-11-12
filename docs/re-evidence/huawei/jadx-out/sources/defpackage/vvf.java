package defpackage;

import android.view.View;
import com.huawei.ui.main.stories.me.activity.BindUserInfoActivity;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public class vvf implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<BindUserInfoActivity> f51621b;
    private int d;

    public vvf(BindUserInfoActivity bindUserInfoActivity, int i) {
        this.f51621b = null;
        this.f51621b = new WeakReference<>(bindUserInfoActivity);
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BindUserInfoActivity bindUserInfoActivity;
        LogUtil.a("MyGenderOnClickListener", "MyGenderOnClickListener onClick(), gender:", Integer.valueOf(this.d));
        WeakReference<BindUserInfoActivity> weakReference = this.f51621b;
        if (weakReference == null || (bindUserInfoActivity = weakReference.get()) == null) {
            return;
        }
        bindUserInfoActivity.c(this.d);
    }
}
