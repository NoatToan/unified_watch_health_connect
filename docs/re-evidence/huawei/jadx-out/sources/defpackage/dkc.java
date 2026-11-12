package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dkc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f31842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31843c;
    private final Context e;

    public dkc(Context context, List<String> list, long j) {
        this.e = context;
        this.f31842b = list;
        this.f31843c = j;
    }

    public void a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        boolean zC = c();
        djy djyVar = new djy(onClickListener);
        djy djyVar2 = new djy(onClickListener2);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.e);
        builder.a(this.e.getString(R.string.IDS_service_area_notice_title));
        builder.d(c(zC));
        builder.c(R.string.IDS_settings_button_cancal, djyVar);
        builder.d(zC ? R.string.IDS_bundle_update_button : R.string.IDS_bundle_download_button, djyVar2);
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.setOnDismissListener(djyVar);
        djyVar2.a(djyVar);
        customViewDialogD.show();
    }

    private View c(boolean z) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.activity_bundle_ask_dialog, (ViewGroup) null);
        d(viewInflate, z);
        d(viewInflate);
        return viewInflate;
    }

    private void d(View view, boolean z) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.bundle_ask_dialog_content);
        int i = z ? R.string.IDS_bundle_download_new_ask_desc : R.string.IDS_bundle_download_ask_desc;
        String strA = qrs.a(this.e, this.f31843c);
        if (LanguageUtil.ba(this.e)) {
            strA = Constants.LRM_STR + strA;
        }
        healthTextView.setText(this.e.getString(i, strA));
    }

    private void d(View view) {
        ((ListView) view.findViewById(R.id.bundle_ask_dialog_list)).setAdapter((ListAdapter) new c(this.e, R.layout.activity_bundle_ask_dialog_list_item, R.id.bundle_dialog_list_item, this.f31842b));
    }

    private boolean c() {
        Set<String> updateModules = AppBundle.c().getUpdateModules(this.e, true);
        Iterator<String> it = this.f31842b.iterator();
        while (it.hasNext()) {
            if (updateModules.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes26.dex */
    static class c extends ArrayAdapter<String> {
        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }

        c(Context context, int i, int i2, List<String> list) {
            super(context, i, i2, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return AppBundle.c().getModuleTitle(getContext(), (String) super.getItem(i));
        }
    }
}
