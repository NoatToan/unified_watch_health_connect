package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.njy;
import defpackage.whr;
import defpackage.whz;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DoubleGroupDataAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28685a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f28687c;
    private int d;
    private OnItemClickListener e;
    private int g;
    private OnItemLongClickListener i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28686b = true;
    private int j = 1;

    public interface ContentEntityListCallback {
        void response(List<a> list);
    }

    public interface OnItemClickListener {
        void onItemClick(f fVar);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(f fVar);
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }

    public void d(OnItemLongClickListener onItemLongClickListener) {
        this.i = onItemLongClickListener;
    }

    public void b(boolean z) {
        this.f28686b = z;
        notifyDataSetChanged();
    }

    public void b(int i) {
        this.j = i;
        if (i == 1) {
            a(false);
        } else {
            notifyDataSetChanged();
        }
    }

    public int c() {
        return this.d;
    }

    public int g() {
        return this.g;
    }

    public void a(final boolean z) {
        if (z) {
            this.d = this.g;
        } else {
            this.d = 0;
        }
        d(new ContentEntityListCallback() { // from class: whp
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.ContentEntityListCallback
            public final void response(List list) {
                DoubleGroupDataAdapter.e(z, list);
            }
        });
        notifyDataSetChanged();
    }

    public static /* synthetic */ void e(boolean z, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f28688c = z;
        }
    }

    public PrivacyDataModel e(f fVar) {
        a aVarA = a(fVar);
        if (aVarA == null) {
            return null;
        }
        return aVarA.e;
    }

    public List<PrivacyDataModel> b() {
        final ArrayList arrayList = new ArrayList(10);
        d(new ContentEntityListCallback() { // from class: whs
            @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.DoubleGroupDataAdapter.ContentEntityListCallback
            public final void response(List list) {
                DoubleGroupDataAdapter.d(arrayList, list);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ void d(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f28688c) {
                list.add(aVar.e);
            }
        }
    }

    public void e(List<whr> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.g = 0;
        this.d = 0;
        this.f28687c = new ArrayList(10);
        for (int i = 0; i < list.size(); i++) {
            whr whrVar = list.get(i);
            c cVar = new c();
            cVar.f28691b = whrVar.a();
            cVar.e = true;
            this.f28687c.add(cVar);
            List<whz> listC = whrVar.c();
            if (listC != null && listC.size() != 0) {
                ArrayList arrayList = new ArrayList(10);
                for (int i2 = 0; i2 < listC.size(); i2++) {
                    whz whzVar = listC.get(i2);
                    e eVar = new e();
                    eVar.f28695a = whzVar.b();
                    eVar.f28696b = true;
                    arrayList.add(eVar);
                    List<PrivacyDataModel> listC2 = whzVar.c();
                    if (listC2 != null && listC2.size() != 0) {
                        ArrayList arrayList2 = new ArrayList(10);
                        for (PrivacyDataModel privacyDataModel : listC2) {
                            this.g++;
                            a aVar = new a();
                            aVar.e = privacyDataModel;
                            arrayList2.add(aVar);
                        }
                        eVar.d = arrayList2;
                    }
                }
                cVar.f28690a = arrayList;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        f fVarA = a(i);
        if (fVarA == null) {
            return 0;
        }
        return fVarA.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new h(LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup, false));
        }
        if (i == 2) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(e(), viewGroup, false));
        }
        return b(LayoutInflater.from(viewGroup.getContext()).inflate(d(), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            if (viewHolder instanceof h) {
                d((h) viewHolder, i);
            }
        } else if (itemViewType == 2) {
            if (viewHolder instanceof d) {
                d((d) viewHolder, i);
            }
        } else if (viewHolder instanceof b) {
            a((b) viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f28687c)) {
            return 0;
        }
        this.f28685a = 0;
        for (int i = 0; i < this.f28687c.size(); i++) {
            this.f28685a++;
            c cVar = this.f28687c.get(i);
            List list = cVar.f28690a;
            if (cVar.e && !njy.e(list)) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    this.f28685a++;
                    e eVar = (e) list.get(i2);
                    List list2 = eVar.d;
                    if (eVar.f28696b && !njy.e(list2)) {
                        for (int i3 = 0; i3 < list2.size(); i3++) {
                            this.f28685a++;
                        }
                    }
                }
            }
        }
        return this.f28685a;
    }

    public int a() {
        return R.layout.privacy_list_father_item;
    }

    public int e() {
        return R.layout.privacy_list_father_item;
    }

    public int d() {
        return R.layout.privacy_list_child_item;
    }

    public b b(View view) {
        return new b(view);
    }

    private void d(ContentEntityListCallback contentEntityListCallback) {
        if (njy.e(this.f28687c)) {
            return;
        }
        Iterator<c> it = this.f28687c.iterator();
        while (it.hasNext()) {
            List list = it.next().f28690a;
            if (!njy.e(list)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List<a> list2 = ((e) it2.next()).d;
                    if (!njy.e(list2)) {
                        contentEntityListCallback.response(list2);
                    }
                }
            }
        }
    }

    private void c(View view, boolean z) {
        if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            if (z) {
                layoutParams.setMargins(0, 0, 0, dimensionPixelSize);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private void d(h hVar, final int i) {
        c cVarC = c(a(i));
        if (cVarC == null) {
            return;
        }
        if (cVarC.e) {
            hVar.f28700b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
        } else {
            hVar.f28700b.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        }
        hVar.b(cVarC.f28691b);
        if (cVarC.f28691b.contains(Constants.LINK)) {
            hVar.f28700b.setVisibility(8);
        } else {
            hVar.f28700b.setVisibility(0);
            hVar.d.setOnClickListener(new View.OnClickListener() { // from class: whu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52058b.b(i, view);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, View view) {
        c cVarC = c(a(i));
        cVarC.e = !cVarC.e;
        notifyDataSetChanged();
    }

    private void d(d dVar, final int i) {
        e eVarD = d(a(i));
        if (eVarD == null) {
            return;
        }
        if (eVarD.f28696b) {
            dVar.f28692a.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
            dVar.d.setBackgroundResource(R.drawable.privacy_card_view_bg_round_top);
        } else {
            dVar.f28692a.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
            dVar.d.setBackgroundResource(R.drawable.privacy_card_view_bg_round);
        }
        c(dVar.d, !eVarD.f28696b);
        dVar.c(eVarD.f28695a);
        dVar.d.setOnClickListener(new View.OnClickListener() { // from class: whn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52050a.e(i, view);
            }
        });
    }

    public /* synthetic */ void e(int i, View view) {
        e eVarD = d(a(i));
        eVarD.f28696b = !eVarD.f28696b;
        notifyDataSetChanged();
    }

    private void a(b bVar, int i) {
        final f fVarA = a(i);
        final a aVarA = a(fVarA);
        if (aVarA == null) {
            return;
        }
        a(bVar, aVarA.f28688c, fVarA.e);
        bVar.a(aVarA.e);
        bVar.i.setOnClickListener(new View.OnClickListener() { // from class: whm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(aVarA, fVarA, view);
            }
        });
        bVar.i.setOnLongClickListener(new View.OnLongClickListener() { // from class: who
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.d.e(aVarA, fVarA, view);
            }
        });
    }

    public /* synthetic */ void d(a aVar, f fVar, View view) {
        if (this.j == 2) {
            e(aVar);
        }
        OnItemClickListener onItemClickListener = this.e;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(fVar);
        }
        notifyDataSetChanged();
    }

    public /* synthetic */ boolean e(a aVar, f fVar, View view) {
        if (this.j == 2) {
            e(aVar);
        } else {
            aVar.f28688c = true;
            this.d++;
        }
        OnItemLongClickListener onItemLongClickListener = this.i;
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(fVar);
        }
        notifyDataSetChanged();
        return true;
    }

    private void e(a aVar) {
        boolean z = aVar.f28688c;
        aVar.f28688c = !z;
        if (z) {
            this.d--;
        } else {
            this.d++;
        }
    }

    private void a(b bVar, boolean z, boolean z2) {
        Context context = bVar.i.getContext();
        if (LanguageUtil.ba(context)) {
            bVar.f28689b.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        if (z2) {
            bVar.i.setBackgroundResource(R.drawable.privacy_card_view_bg_round_bottom);
            bVar.h.setVisibility(8);
        } else {
            bVar.i.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWearHomeBg));
            bVar.h.setVisibility(0);
        }
        if (this.j == 2) {
            bVar.f28689b.setVisibility(8);
            bVar.j.setVisibility(0);
            bVar.j.setChecked(z);
        } else {
            bVar.j.setVisibility(8);
            if (this.f28686b) {
                bVar.f28689b.setVisibility(0);
            } else {
                bVar.f28689b.setVisibility(8);
            }
        }
        c(bVar.i, z2);
    }

    private c c(f fVar) {
        if (fVar == null || njy.e(this.f28687c)) {
            return null;
        }
        for (int i = 0; i < this.f28687c.size(); i++) {
            if (i == fVar.f28698b) {
                return this.f28687c.get(i);
            }
        }
        return null;
    }

    private e d(f fVar) {
        e eVar = null;
        if (fVar != null && !njy.e(this.f28687c)) {
            for (int i = 0; i < this.f28687c.size(); i++) {
                if (i == fVar.f28698b) {
                    List list = this.f28687c.get(i).f28690a;
                    if (!njy.e(list)) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            if (i2 == fVar.f28697a) {
                                eVar = (e) list.get(i2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return eVar;
    }

    private a a(f fVar) {
        a aVarA = null;
        if (fVar != null && !njy.e(this.f28687c)) {
            for (int i = 0; i < this.f28687c.size(); i++) {
                if (i == fVar.f28698b) {
                    List list = this.f28687c.get(i).f28690a;
                    if (njy.e(list)) {
                        continue;
                    } else {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            if (i2 == fVar.f28697a && (aVarA = a((e) list.get(i2), fVar)) != null) {
                                return aVarA;
                            }
                        }
                    }
                }
            }
        }
        return aVarA;
    }

    private a a(e eVar, f fVar) {
        if (eVar == null || fVar == null) {
            return null;
        }
        List list = eVar.d;
        if (njy.e(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == fVar.f28699c) {
                return (a) list.get(i);
            }
        }
        return null;
    }

    private f a(int i) {
        f fVar = null;
        if (njy.e(this.f28687c)) {
            return null;
        }
        this.f28685a = -1;
        for (int i2 = 0; i2 < this.f28687c.size(); i2++) {
            int i3 = this.f28685a + 1;
            this.f28685a = i3;
            if (i == i3) {
                return new f(1, i2, 0, 0, false);
            }
            c cVar = this.f28687c.get(i2);
            List<e> list = cVar.f28690a;
            if (cVar.e && !njy.e(list)) {
                f fVarC = c(i, i2, list);
                if (fVarC != null) {
                    return fVarC;
                }
                fVar = fVarC;
            }
        }
        return fVar;
    }

    private f c(int i, int i2, List<e> list) {
        if (njy.e(list)) {
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = this.f28685a + 1;
            this.f28685a = i4;
            if (i == i4) {
                return new f(2, i2, i3, 0, false);
            }
            e eVar = list.get(i3);
            List list2 = eVar.d;
            if (eVar.f28696b && !njy.e(list2)) {
                int i5 = 0;
                while (i5 < list2.size()) {
                    int i6 = this.f28685a + 1;
                    this.f28685a = i6;
                    if (i == i6) {
                        return new f(3, i2, i3, i5, i5 == list2.size() - 1);
                    }
                    i5++;
                }
            }
        }
        return null;
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28699c;
        private int d;
        private boolean e;

        f(int i, int i2, int i3, int i4, boolean z) {
            this.d = i;
            this.f28698b = i2;
            this.f28697a = i3;
            this.f28699c = i4;
            this.e = z;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<e> f28690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28691b;
        private boolean e;

        private c() {
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28696b;
        private List<a> d;

        private e() {
        }
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28688c;
        private PrivacyDataModel e;

        private a() {
        }
    }

    class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28700b;
        View d;
        HealthTextView e;

        h(View view) {
            super(view);
            this.d = view.findViewById(R.id.privacy_title_layout);
            this.e = (HealthTextView) view.findViewById(R.id.privacy_title);
            this.f28700b = (ImageView) view.findViewById(R.id.content_item_arrow);
        }

        void b(String str) {
            this.e.setText(str);
        }
    }

    class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f28692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28693b;
        View d;

        d(View view) {
            super(view);
            this.d = view.findViewById(R.id.privacy_title_layout);
            this.f28693b = (HealthTextView) view.findViewById(R.id.privacy_title);
            this.f28692a = (ImageView) view.findViewById(R.id.content_item_arrow);
        }

        void c(String str) {
            this.f28693b.setText(str);
        }
    }

    class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28689b;
        HealthTextView g;
        View h;
        View i;
        HealthCheckBox j;
        HealthTextView k;

        b(View view) {
            super(view);
            this.i = view.findViewById(R.id.privacy_item_rl);
            this.k = (HealthTextView) view.findViewById(R.id.privacy_content_title);
            this.g = (HealthTextView) view.findViewById(R.id.privacy_time);
            this.f28689b = (ImageView) view.findViewById(R.id.content_item_arrow);
            HealthCheckBox healthCheckBox = (HealthCheckBox) view.findViewById(R.id.content_item_check);
            this.j = healthCheckBox;
            healthCheckBox.setClickable(false);
            this.h = view.findViewById(R.id.data_line);
        }

        void a(PrivacyDataModel privacyDataModel) {
            this.k.setText(privacyDataModel.getDataTitle());
            this.g.setText(privacyDataModel.getDataDesc());
        }
    }
}
