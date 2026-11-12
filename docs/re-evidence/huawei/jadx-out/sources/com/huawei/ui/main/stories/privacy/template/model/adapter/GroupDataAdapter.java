package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.njy;
import defpackage.whz;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class GroupDataAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnItemClickListener f28704c;
    private OnLongClickListener f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<whz> f28702a = new ArrayList(10);
    private int h = 1;
    private boolean d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<List<Boolean>> f28703b = new ArrayList<>(10);
    private int j = 0;
    private int e = 0;

    public interface OnItemClickListener {
        void onItemClickListener(int i, int i2);
    }

    public interface OnLongClickListener {
        void onLongClickListener(int i, int i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public void b(List<whz> list) {
        this.f28702a.clear();
        this.f28702a.addAll(list);
        this.e = 0;
        this.j = d(this.f28702a);
        e();
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f28702a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (i >= this.f28702a.size()) {
            LogUtil.c("PrivacyExpandViewAdapter", "getChildrenCount is out of bounds");
            return 0;
        }
        List<PrivacyDataModel> listC = this.f28702a.get(i).c();
        if (listC == null) {
            return 0;
        }
        return listC.size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public whz getGroup(int i) {
        if (this.f28702a.size() > i) {
            return this.f28702a.get(i);
        }
        LogUtil.c("PrivacyExpandViewAdapter", "getGroup is out of bounds");
        return new whz();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PrivacyDataModel getChild(int i, int i2) {
        if (njy.c(this.f28702a, i)) {
            List<PrivacyDataModel> listC = this.f28702a.get(i).c();
            if (njy.c(listC, i2) && listC.get(i2) != null) {
                return listC.get(i2);
            }
            LogUtil.c("PrivacyExpandViewAdapter", "getChild is out of bounds");
        }
        return new PrivacyDataModel();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_list_father_item, viewGroup, false);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            aVar = tag instanceof a ? (a) tag : null;
        }
        if (aVar != null) {
            aVar.d.setText(this.f28702a.get(i).b());
            ViewGroup.LayoutParams layoutParams = aVar.e.getLayoutParams();
            if (z) {
                aVar.f28708c.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                aVar.e.setBackgroundResource(R.drawable.privacy_card_view_bg_round_top);
            } else {
                aVar.f28708c.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
                aVar.e.setBackgroundResource(R.drawable.privacy_card_view_bg_round);
            }
            a(aVar.e, layoutParams, !z);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        e eVarD;
        if (view == null) {
            view = a(viewGroup);
            eVarD = d(view);
            view.setTag(eVarD);
        } else {
            Object tag = view.getTag();
            eVarD = tag instanceof e ? (e) tag : null;
        }
        if (eVarD != null) {
            eVarD.b(this.f28702a.get(i).c().get(i2));
            if (LanguageUtil.ba(eVarD.h.getContext())) {
                eVarD.f28709a.setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
            ViewGroup.LayoutParams layoutParams = eVarD.h.getLayoutParams();
            if (z) {
                eVarD.h.setBackgroundResource(R.drawable.privacy_card_view_bg_round_bottom);
                eVarD.f.setVisibility(8);
            } else {
                eVarD.h.setBackgroundColor(ContextCompat.getColor(eVarD.h.getContext(), R.color.colorWearHomeBg));
                eVarD.f.setVisibility(0);
            }
            a(eVarD.h, layoutParams, z);
            d(eVarD, i2, i);
        }
        return view;
    }

    private void a(View view, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.setMargins(0, 0, 0, dimensionPixelSize);
            } else {
                layoutParams2.setMargins(0, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams2);
        }
    }

    public View a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_list_child_item, viewGroup, false);
    }

    public e d(View view) {
        return new e(view);
    }

    public PrivacyDataModel c(int i, int i2) {
        if (i >= this.f28702a.size()) {
            return new PrivacyDataModel();
        }
        List<PrivacyDataModel> listC = this.f28702a.get(i).c();
        if (i2 >= listC.size()) {
            return new PrivacyDataModel();
        }
        return listC.get(i2);
    }

    protected void d(final e eVar, final int i, final int i2) {
        eVar.h.setOnClickListener(new View.OnClickListener() { // from class: whq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(i2, i, view);
            }
        });
        if (this.h == 2) {
            eVar.e.setOnCheckedChangeListener(null);
            eVar.f28709a.setVisibility(8);
            eVar.e.setVisibility(0);
            if (njy.e(this.f28703b, i2)) {
                LogUtil.d("PrivacyExpandViewAdapter", "setChildViewData mCheckList isOutOfBounds");
                return;
            }
            List<Boolean> list = this.f28703b.get(i2);
            if (njy.e(list, i)) {
                LogUtil.d("PrivacyExpandViewAdapter", "setChildViewData childCheckList isOutOfBounds");
                return;
            }
            Boolean bool = list.get(i);
            if (bool != null) {
                eVar.e.setChecked(bool.booleanValue());
            }
            eVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f28705a.e(eVar, i2, i, compoundButton, z);
                }
            });
            return;
        }
        eVar.f28709a.setVisibility(0);
        eVar.e.setVisibility(8);
        if (!this.d) {
            eVar.f28709a.setVisibility(8);
        }
        eVar.h.setOnLongClickListener(new View.OnLongClickListener() { // from class: wht
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f52057c.c(i2, i, view);
            }
        });
    }

    public /* synthetic */ void e(int i, int i2, View view) {
        OnItemClickListener onItemClickListener = this.f28704c;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClickListener(i, i2);
        }
    }

    /* synthetic */ void e(e eVar, int i, int i2, CompoundButton compoundButton, boolean z) {
        if (this.f28704c != null) {
            eVar.e.setChecked(z);
            this.f28704c.onItemClickListener(i, i2);
        }
    }

    public /* synthetic */ boolean c(int i, int i2, View view) {
        this.f.onLongClickListener(i, i2);
        return true;
    }

    public void d(boolean z) {
        if (z) {
            this.e = this.j;
        } else {
            this.e = 0;
        }
        for (List<Boolean> list : this.f28703b) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, Boolean.valueOf(z));
            }
        }
        notifyDataSetChanged();
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.f28704c = onItemClickListener;
    }

    public void b(OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
    }

    public void a(int i) {
        this.h = i;
        if (i == 1) {
            d(false);
        } else {
            notifyDataSetChanged();
        }
    }

    public void e() {
        this.f28703b.clear();
        if (njy.e(this.f28702a)) {
            return;
        }
        for (whz whzVar : this.f28702a) {
            if (whzVar != null) {
                List<PrivacyDataModel> listC = whzVar.c();
                if (listC != null) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < listC.size(); i++) {
                        arrayList.add(false);
                    }
                    this.f28703b.add(arrayList);
                } else {
                    this.f28703b.add(new ArrayList(10));
                }
            }
        }
    }

    public void c(boolean z) {
        this.d = z;
        notifyDataSetChanged();
    }

    public void d(int i, int i2) {
        if (njy.e(this.f28703b, i)) {
            LogUtil.d("PrivacyExpandViewAdapter", "switchCheckStatus mCheckList isOutOfBounds");
            return;
        }
        List<Boolean> list = this.f28703b.get(i);
        if (njy.e(list, i2)) {
            LogUtil.d("PrivacyExpandViewAdapter", "switchCheckStatus childList isOutOfBounds");
            return;
        }
        boolean zBooleanValue = list.get(i2).booleanValue();
        if (zBooleanValue) {
            this.e--;
        } else {
            this.e++;
        }
        list.set(i2, Boolean.valueOf(!zBooleanValue));
        notifyDataSetChanged();
    }

    public List<PrivacyDataModel> c() {
        ArrayList arrayList = new ArrayList(10);
        ArrayList<List<Boolean>> arrayList2 = this.f28703b;
        if (arrayList2 != null && arrayList2.size() != 0) {
            for (int i = 0; i < this.f28703b.size(); i++) {
                List<Boolean> list = this.f28703b.get(i);
                List<PrivacyDataModel> listC = this.f28702a.get(i).c();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (list.get(i2).booleanValue()) {
                        arrayList.add(listC.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public int d() {
        return this.e;
    }

    public int a() {
        return this.j;
    }

    private int d(List<whz> list) {
        int size = 0;
        if (list != null && list.size() != 0) {
            Iterator<whz> it = list.iterator();
            while (it.hasNext()) {
                size += it.next().c().size();
            }
        }
        return size;
    }

    protected static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected ImageView f28708c;
        protected HealthTextView d;
        protected View e;

        protected a(View view) {
            this.d = (HealthTextView) view.findViewById(R.id.privacy_title);
            this.e = view.findViewById(R.id.privacy_title_layout);
            this.f28708c = (ImageView) view.findViewById(R.id.content_item_arrow);
        }
    }

    protected class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected ImageView f28709a;
        protected HealthTextView d;
        protected HealthCheckBox e;
        protected View f;
        protected HealthTextView g;
        protected View h;

        e(View view) {
            this.d = (HealthTextView) view.findViewById(R.id.privacy_content_title);
            this.g = (HealthTextView) view.findViewById(R.id.privacy_time);
            this.h = view.findViewById(R.id.privacy_item_rl);
            this.f = view.findViewById(R.id.data_line);
            this.f28709a = (ImageView) view.findViewById(R.id.content_item_arrow);
            this.e = (HealthCheckBox) view.findViewById(R.id.content_item_check);
        }

        protected void b(PrivacyDataModel privacyDataModel) {
            this.d.setText(privacyDataModel.getDataTitle());
            if (LanguageUtil.bs(this.d.getContext())) {
                this.d.setAutoTextInfo(10, 1, 1);
            }
            this.g.setText(privacyDataModel.getDataDesc());
        }
    }
}
