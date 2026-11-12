package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.api.browserswitch.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes21.dex */
public class sy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sz f48795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tc f48796c;
    private final tg d;

    private boolean a(int i) {
        return i != Integer.MIN_VALUE;
    }

    public sy() {
        this(new sz(), tc.d(), new tg());
    }

    sy(sz szVar, tc tcVar, tg tgVar) {
        this.f48795b = szVar;
        this.f48796c = tcVar;
        this.d = tgVar;
    }

    public void d(FragmentActivity fragmentActivity, tb tbVar) throws sx {
        a(fragmentActivity, tbVar);
        Context applicationContext = fragmentActivity.getApplicationContext();
        Uri uriB = tbVar.b();
        this.f48796c.c(new ta(tbVar.a(), uriB, tbVar.e(), tbVar.c(), tbVar.d(), true), applicationContext);
        if (fragmentActivity.isFinishing()) {
            throw new sx("Unable to start browser switch while host Activity is finishing.");
        }
        if (this.f48795b.c(applicationContext)) {
            this.d.b(fragmentActivity, uriB, tbVar.i());
        } else {
            try {
                fragmentActivity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uriB));
            } catch (ActivityNotFoundException unused) {
                throw new sx("Unable to start browser switch without a web browser.");
            }
        }
    }

    void a(FragmentActivity fragmentActivity, tb tbVar) throws sx {
        String string;
        Context applicationContext = fragmentActivity.getApplicationContext();
        int iA = tbVar.a();
        String strC = tbVar.c();
        if (!a(iA)) {
            string = fragmentActivity.getString(R.string.error_request_code_invalid);
        } else if (strC == null && tbVar.d() == null) {
            string = fragmentActivity.getString(R.string.error_app_link_uri_or_return_url_required);
        } else {
            string = (strC == null || this.f48795b.b(applicationContext, strC)) ? null : fragmentActivity.getString(R.string.error_device_not_configured_for_deep_link);
        }
        if (string != null) {
            throw new sx(string);
        }
    }

    public td b(FragmentActivity fragmentActivity) {
        Context applicationContext = fragmentActivity.getApplicationContext();
        ta taVarE = this.f48796c.e(applicationContext);
        if (taVarE == null) {
            return null;
        }
        td tdVarA = a(fragmentActivity);
        if (tdVarA != null) {
            int iA = tdVarA.a();
            if (iA == 1) {
                this.f48796c.c(applicationContext);
            } else if (iA == 2) {
                taVarE.a(false);
                this.f48796c.c(taVarE, fragmentActivity);
                return tdVarA;
            }
        }
        return tdVarA;
    }

    public td a(FragmentActivity fragmentActivity) {
        Intent intent = fragmentActivity.getIntent();
        ta taVarE = this.f48796c.e(fragmentActivity.getApplicationContext());
        if (taVarE == null || intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null && (taVarE.c(data) || taVarE.d(data))) {
            return new td(1, taVarE, data);
        }
        if (taVarE.b()) {
            return new td(2, taVarE);
        }
        return null;
    }

    public td d(Context context) {
        return this.f48796c.b(context.getApplicationContext());
    }

    public td e(Context context) {
        td tdVarD = d(context);
        if (tdVarD != null) {
            this.f48796c.a(context.getApplicationContext());
        }
        return tdVarD;
    }

    public void d(FragmentActivity fragmentActivity) {
        Uri data;
        Intent intent = fragmentActivity.getIntent();
        ta taVarE = this.f48796c.e(fragmentActivity.getApplicationContext());
        if (taVarE == null || intent == null || (data = intent.getData()) == null) {
            return;
        }
        this.f48796c.a(new td(1, taVarE, data), fragmentActivity.getApplicationContext());
    }
}
