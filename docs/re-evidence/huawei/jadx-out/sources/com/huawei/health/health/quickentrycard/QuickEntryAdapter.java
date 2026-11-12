package com.huawei.health.health.quickentrycard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.ezg;
import defpackage.fww;
import defpackage.qqf;
import defpackage.qre;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class QuickEntryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnLongClickListener f7068a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LayoutInflater f7069c;
    private List<ezg> d = new ArrayList();
    private OnQuickEntryClickListener e;

    public interface OnQuickEntryClickListener {
        void onViewClick(View view, ezg ezgVar);
    }

    public QuickEntryAdapter(Context context) {
        this.f7069c = LayoutInflater.from(context);
    }

    public void b(List<ezg> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.d = list;
        notifyDataSetChanged();
    }

    public List<ezg> a() {
        return this.d;
    }

    public void c(OnQuickEntryClickListener onQuickEntryClickListener) {
        this.e = onQuickEntryClickListener;
    }

    public void d(View.OnLongClickListener onLongClickListener) {
        this.f7068a = onLongClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(this.f7069c.inflate(R.layout.quick_entry_item_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        layoutParams.width = this.d.size() > 2 ? -2 : -1;
        viewHolder.itemView.setLayoutParams(layoutParams);
        final ezg ezgVar = this.d.get(i);
        d dVar = viewHolder instanceof d ? (d) viewHolder : null;
        if (dVar == null) {
            LogUtil.j("Suggestion_QuickEntryAdapter", "quickEntryViewHolder is null");
            return;
        }
        LogUtil.a("Suggestion_QuickEntryAdapter", "onBindViewHolder quickEntry:", ezgVar != null ? ezgVar.d() : Constants.NULL, " position:", Integer.valueOf(i));
        dVar.b(ezgVar, this.d.size());
        dVar.f7070a.setOnClickListener(new View.OnClickListener() { // from class: ezc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33720b.e(ezgVar, view);
            }
        });
        dVar.f7071b.setOnClickListener(new View.OnClickListener() { // from class: eyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(ezgVar, view);
            }
        });
        dVar.d.setOnClickListener(new View.OnClickListener() { // from class: eze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(ezgVar, view);
            }
        });
        dVar.f7070a.setOnLongClickListener(new View.OnLongClickListener() { // from class: ezd
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.d.a(view);
            }
        });
        dVar.f7071b.setOnLongClickListener(new View.OnLongClickListener() { // from class: ezd
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.d.a(view);
            }
        });
        dVar.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: ezd
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.d.a(view);
            }
        });
    }

    public /* synthetic */ void c(ezg ezgVar, View view) {
        OnQuickEntryClickListener onQuickEntryClickListener = this.e;
        if (onQuickEntryClickListener != null) {
            onQuickEntryClickListener.onViewClick(view, ezgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        View.OnLongClickListener onLongClickListener = this.f7068a;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(view);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, ezg ezgVar) {
        if (ezgVar == null) {
            LogUtil.j("Suggestion_QuickEntryAdapter", "resourceClick quickEntryBean is null");
            return;
        }
        if (this.d.size() == 1 && ezgVar.f() != null) {
            ezgVar.f().onClick(view);
            return;
        }
        if (view != null && view.getId() == R.id.quick_entry_frame_layout && this.d.size() == 2 && Objects.equals(ezgVar.d(), "entryHealthHeadline") && ezgVar.f() != null) {
            ezgVar.f().onClick(view);
            return;
        }
        OnQuickEntryClickListener onQuickEntryClickListener = this.e;
        if (onQuickEntryClickListener != null) {
            onQuickEntryClickListener.onViewClick(view, ezgVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f7070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FrameLayout f7071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f7072c;
        private final TextView d;
        private final HealthImageView e;

        public d(View view) {
            super(view);
            this.f7071b = (FrameLayout) view.findViewById(R.id.quick_entry_frame_layout);
            this.f7070a = (TextView) view.findViewById(R.id.quick_entry_text);
            this.f7072c = (ImageView) view.findViewById(R.id.quick_entry_icon);
            this.d = (TextView) view.findViewById(R.id.quick_entry_text_right);
            this.e = (HealthImageView) view.findViewById(R.id.quick_entry_audio_image);
        }

        public void b(ezg ezgVar, int i) {
            String strC;
            if (ezgVar == null) {
                LogUtil.j("Suggestion_QuickEntryAdapter", "quickEntry is null");
                return;
            }
            this.itemView.setVisibility(0);
            if (i == 1 && !TextUtils.isEmpty(ezgVar.j())) {
                this.f7070a.setText(ezgVar.j());
                this.d.setText(ezgVar.i());
                strC = ezgVar.c();
            } else if (i == 2 && Objects.equals(ezgVar.d(), "entryHealthHeadline")) {
                this.f7070a.setText(ezgVar.j());
                this.d.setText("");
                strC = ezgVar.c();
            } else {
                this.f7070a.setText(ezgVar.i());
                this.d.setText("");
                strC = "";
            }
            if (!TextUtils.isEmpty(strC)) {
                qqf.e(this.e, strC, qre.b(R.dimen.health_common_20dp), 0, fww.f34656a);
                this.f7072c.setImageResource(ezgVar.e() ? R.drawable.quick_entry_pause : R.drawable.quick_entry_play);
                this.f7070a.setSingleLine(true);
                this.f7070a.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.f7070a.setMarqueeRepeatLimit(-1);
                this.f7070a.setFocusable(false);
                this.f7070a.setFocusableInTouchMode(false);
                this.f7070a.setHorizontallyScrolling(true);
                this.f7070a.setSelected(true);
                return;
            }
            this.f7072c.setImageResource(ezgVar.a());
            this.f7070a.setSingleLine(true);
            this.f7070a.setEllipsize(TextUtils.TruncateAt.END);
            this.f7070a.setMarqueeRepeatLimit(0);
            this.f7070a.setFocusable(false);
            this.f7070a.setFocusableInTouchMode(false);
            this.f7070a.setHorizontallyScrolling(false);
            this.f7070a.setSelected(false);
        }
    }
}
