package com.huawei.featureuserprofile.sos.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.iod;
import defpackage.qlo;
import defpackage.qqf;
import health.compact.a.EnvironmentInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class EditContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<iod> f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EditContactAdapterCallback f5678b;
    private boolean d;
    private Context e;

    /* JADX INFO: loaded from: classes2.dex */
    public interface EditContactAdapterCallback {
        void onAddContact();

        void onManuallyAddContact();

        void showRemoveContactDialog(EmergencyInfoManager.e eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditContactAdapter(Context context, List<iod> list) {
        this.e = context;
        if (context instanceof EditContactAdapterCallback) {
            this.f5678b = (EditContactAdapterCallback) context;
        }
        this.f5677a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            LogUtil.j("EditContactAdapter", "onCreateViewHolder parent is null");
            return null;
        }
        if (i == 1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.preference_simple_text, viewGroup, false));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.edit_contact_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof a) {
            EmergencyInfoManager.e eVarC = i < this.f5677a.size() ? c(null, this.f5677a.get(i)) : null;
            if (eVarC == null) {
                LogUtil.j("EditContactAdapter", "onBindViewHolder emergencyContact is null");
                return;
            } else {
                ((a) viewHolder).a(eVarC);
                return;
            }
        }
        if (EnvironmentInfo.m()) {
            LogUtil.a("EditContactAdapter", "isMobileAppEngine");
            HealthDivider healthDivider = (HealthDivider) viewHolder.itemView.findViewById(R.id.emergency_divider);
            LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(R.id.emergency_linear);
            healthDivider.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        HealthTextView healthTextView = (HealthTextView) viewHolder.itemView.findViewById(R.id.tips_text);
        ((ImageView) viewHolder.itemView.findViewById(R.id.book_item_iamge)).setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_address_book));
        healthTextView.setText(this.e.getString(R.string.IDS_book_add_emergency_contact));
        viewHolder.itemView.findViewById(R.id.tips_text).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditContactAdapter.this.f5678b != null) {
                    EditContactAdapter.this.f5678b.onAddContact();
                }
            }
        });
        HealthTextView healthTextView2 = (HealthTextView) viewHolder.itemView.findViewById(R.id.tips_manually_add_text);
        ((ImageView) viewHolder.itemView.findViewById(R.id.manuall_add_item_image)).setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_manually_add));
        healthTextView2.setText(this.e.getString(R.string.IDS_scan_add));
        viewHolder.itemView.findViewById(R.id.tips_manually_add_text).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditContactAdapter.this.f5678b != null) {
                    EditContactAdapter.this.f5678b.onManuallyAddContact();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.d && i == getItemCount() - 1) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<iod> list = this.f5677a;
        int size = list == null ? 0 : list.size();
        return this.d ? size + 1 : size;
    }

    private EmergencyInfoManager.e c(EmergencyInfoManager.e eVar, iod iodVar) {
        if (iodVar == null) {
            return eVar;
        }
        if (!iodVar.c()) {
            return new EmergencyInfoManager.e(Uri.parse(iodVar.b()), iodVar.e(), iodVar.b());
        }
        return EmergencyInfoManager.a().d(Uri.parse(iodVar.a()));
    }

    public void a(boolean z) {
        this.d = z;
    }

    class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f5681a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f5683c;
        private ImageView d;
        private HealthTextView e;

        a(View view) {
            super(view);
            this.d = (ImageView) view.findViewById(R.id.head_view);
            this.e = (HealthTextView) view.findViewById(R.id.double_title);
            this.f5683c = (HealthTextView) view.findViewById(R.id.double_summary);
            this.f5681a = (ImageView) view.findViewById(R.id.remove_contact);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final EmergencyInfoManager.e eVar) {
            this.d.setImageDrawable(b(eVar));
            this.e.setText(eVar.c());
            this.f5683c.setText(eVar.d());
            this.f5681a.setImageDrawable(EditContactAdapter.this.e.getResources().getDrawable(R.drawable.ic_edit_delete));
            this.f5681a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditContactAdapter.this.f5678b != null) {
                        EditContactAdapter.this.f5678b.showRemoveContactDialog(eVar);
                    }
                }
            });
        }

        private Drawable b(EmergencyInfoManager.e eVar) {
            Bitmap bitmapE = eVar.e();
            if (bitmapE != null) {
                return new BitmapDrawable(EditContactAdapter.this.e.getResources(), qqf.a(bitmapE));
            }
            return qlo.b(EditContactAdapter.this.e.getResources(), new qlo.e(null, String.valueOf(eVar.a()), true));
        }
    }

    static class c extends RecyclerView.ViewHolder {
        c(View view) {
            super(view);
        }
    }
}
