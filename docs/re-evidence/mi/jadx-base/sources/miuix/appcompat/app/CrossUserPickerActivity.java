package miuix.appcompat.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import defpackage.chh;
import defpackage.dgq;
import defpackage.oi4;
import miui.securityspace.CrossUserUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CrossUserPickerActivity extends AppCompatActivity {
    public volatile ContextWrapper h;
    public volatile ContentResolver i;
    public final Object j = new Object();

    public class a extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f26306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UserHandle f26307b;

        public a(Context context, UserHandle userHandle) {
            super(context);
            this.f26306a = context;
            this.f26307b = userHandle;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public ContentResolver getContentResolver() {
            return oi4.a(this.f26306a, this.f26307b);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        if (!l() || !chh.a()) {
            return super.getApplicationContext();
        }
        if (this.h == null) {
            synchronized (this.j) {
                try {
                    if (this.h == null) {
                        this.h = new a(super.getApplicationContext(), dgq.a(n()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.h;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
        if (!l() || !chh.a()) {
            return super.getContentResolver();
        }
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = oi4.a(this, dgq.a(n()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public boolean l() {
        return n() != -1;
    }

    public final boolean m() {
        return getPackageName().equals(getCallingPackage()) || CrossUserUtils.checkUidPermission(this, getCallingPackage());
    }

    public final int n() {
        if (getIntent() == null) {
            return -1;
        }
        int intExtra = getIntent().getIntExtra("android.intent.extra.picked_user_id", -1);
        if (m()) {
            return intExtra;
        }
        return -1;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (l()) {
            intent.putExtra("android.intent.extra.picked_user_id", n());
        }
        super.startActivity(intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (l()) {
            intent.putExtra("android.intent.extra.picked_user_id", n());
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityFromFragment(android.app.Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (l()) {
            intent.putExtra("android.intent.extra.picked_user_id", n());
        }
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        if (l()) {
            intent.putExtra("android.intent.extra.picked_user_id", n());
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (l()) {
            intent.putExtra("android.intent.extra.picked_user_id", n());
        }
        super.startActivityForResult(intent, i, bundle);
    }
}
