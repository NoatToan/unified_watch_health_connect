package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pmx;
import defpackage.pnc;
import defpackage.pns;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class StickerItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22510c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22511a;
    private OnItemClickListener g;
    private List<pnc> h;
    private int i;
    private int e = -1;
    private boolean d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f22512b = new c();

    public interface OnItemClickListener {
        void onItemClick(int i, int i2, int i3, pmx pmxVar, int i4, ShareDataInfo shareDataInfo);
    }

    public StickerItemAdapter(Context context, List<pnc> list, OnItemClickListener onItemClickListener) {
        this.f22511a = context;
        this.h = list;
        this.g = onItemClickListener;
    }

    public void e(List<pnc> list) {
        if (njy.e(list)) {
            return;
        }
        this.h = list;
        notifyDataSetChanged();
    }

    public void d(int i) {
        this.i = i;
    }

    public void e(int i) {
        this.e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.h)) {
            return 0;
        }
        return this.h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.h)) {
            return 0;
        }
        return this.h.get(i).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            ColorContentViewHolder colorContentViewHolder = new ColorContentViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
            colorContentViewHolder.b(this.f22512b);
            return colorContentViewHolder;
        }
        if (i == 2) {
            LayoutContentViewHolder layoutContentViewHolder = new LayoutContentViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
            layoutContentViewHolder.c(this.f22512b);
            return layoutContentViewHolder;
        }
        if (i == 3) {
            MaskContentViewHolder maskContentViewHolder = new MaskContentViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
            maskContentViewHolder.c(this.f22512b);
            return maskContentViewHolder;
        }
        if (i == 4) {
            MarkColorContentViewHolder markColorContentViewHolder = new MarkColorContentViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
            markColorContentViewHolder.b(this.f22512b);
            return markColorContentViewHolder;
        }
        if (i == 5) {
            StickerContentViewHolder stickerContentViewHolder = new StickerContentViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.share_item_recycle_layout, viewGroup, false));
            stickerContentViewHolder.e(this.f22512b);
            return stickerContentViewHolder;
        }
        return new TitleViewHolder(LayoutInflater.from(this.f22511a).inflate(R.layout.title_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        pnc pncVar;
        if (njy.e(this.h) || (pncVar = this.h.get(i)) == null) {
            return;
        }
        if (viewHolder instanceof TitleViewHolder) {
            ((TitleViewHolder) viewHolder).c(pncVar);
            return;
        }
        if (viewHolder instanceof ColorContentViewHolder) {
            ((ColorContentViewHolder) viewHolder).c(this.f22511a, this.h, i, this.g);
            return;
        }
        if (!(viewHolder instanceof LayoutContentViewHolder)) {
            if (!(viewHolder instanceof MaskContentViewHolder)) {
                if (viewHolder instanceof MarkColorContentViewHolder) {
                    ((MarkColorContentViewHolder) viewHolder).d(this.f22511a, this.h, i, this.g);
                    return;
                } else if (!(viewHolder instanceof StickerContentViewHolder)) {
                    LogUtil.a("Share_StickerItemAdapter", "onBindViewHolder no branch.");
                    return;
                } else {
                    ((StickerContentViewHolder) viewHolder).e(this.f22511a, this.h, i, this.i, this.g);
                    return;
                }
            }
            ((MaskContentViewHolder) viewHolder).e(this.f22511a, this.h, i, this.g);
            return;
        }
        ((LayoutContentViewHolder) viewHolder).c(this.f22511a, this.h, i, this.e, this.g);
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        TextView d;

        public TitleViewHolder(View view) {
            super(view);
            this.d = (TextView) view.findViewById(R.id.head_text);
        }

        public void c(pnc pncVar) {
            this.d.setText(pncVar.d());
        }
    }

    public static class ColorContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f22513c;
        private HealthRecycleView d;
        private ColorListAdapter e;

        public void b(c cVar) {
            this.f22513c = cVar;
        }

        public ColorContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.d = healthRecycleView;
            healthRecycleView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        }

        public void c(Context context, List<pnc> list, int i, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<Integer> listA = list.get(i).a();
            if (njy.e(listA)) {
                return;
            }
            ColorListAdapter colorListAdapter = this.e;
            if (colorListAdapter != null) {
                colorListAdapter.a(listA);
                return;
            }
            this.e = new ColorListAdapter(context, 0, listA, new ColorListAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.ColorContentViewHolder.4
                @Override // com.huawei.pluginsocialshare.adapter.ColorListAdapter.OnItemClickListener
                public void onItemClick(int i2, int i3) {
                    int unused = StickerItemAdapter.f22510c = 1;
                    if (lrd.d()) {
                        ColorContentViewHolder.this.f22513c.a(ColorContentViewHolder.this.e.a());
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i2, i3, -1, null, 0, null);
                    }
                }
            });
            this.d.setNestedScrollingEnabled(false);
            this.d.setAdapter(this.e);
            c cVar = this.f22513c;
            if (cVar != null) {
                this.e.d(cVar);
                qsp.a(this.d, this.f22513c);
            }
        }
    }

    public static class MarkColorContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ColorListAdapter f22519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f22520b;
        private HealthRecycleView d;

        public void b(c cVar) {
            this.f22520b = cVar;
        }

        public MarkColorContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.d = healthRecycleView;
            healthRecycleView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        }

        public void d(Context context, List<pnc> list, int i, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<Integer> listA = list.get(i).a();
            if (njy.e(listA)) {
                return;
            }
            ColorListAdapter colorListAdapter = this.f22519a;
            if (colorListAdapter != null) {
                colorListAdapter.a(listA);
                return;
            }
            this.f22519a = new ColorListAdapter(context, 1, listA, new ColorListAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.MarkColorContentViewHolder.4
                @Override // com.huawei.pluginsocialshare.adapter.ColorListAdapter.OnItemClickListener
                public void onItemClick(int i2, int i3) {
                    int unused = StickerItemAdapter.f22510c = 1;
                    if (lrd.d()) {
                        MarkColorContentViewHolder.this.f22520b.a(MarkColorContentViewHolder.this.f22519a.a());
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i2, 0, -1, null, i3, null);
                    }
                }
            });
            this.d.setNestedScrollingEnabled(false);
            this.d.setAdapter(this.f22519a);
            c cVar = this.f22520b;
            if (cVar != null) {
                this.f22519a.d(cVar);
                qsp.a(this.d, this.f22520b);
            }
        }
    }

    public static class LayoutContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LayoutListAdapter f22514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthRecycleView f22515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f22516c;

        public void c(c cVar) {
            this.f22516c = cVar;
        }

        public LayoutContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.f22515b = healthRecycleView;
            healthRecycleView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Context context, List<pnc> list, int i, int i2, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            int[] iArrE = list.get(i).e();
            List<Integer> listB = list.get(i).b();
            List<Integer> listG = list.get(i).g();
            if (iArrE == null || iArrE.length == 0 || njy.e(listB) || njy.e(listG)) {
                return;
            }
            LayoutListAdapter layoutListAdapter = this.f22514a;
            if (layoutListAdapter != null) {
                if (i2 != -1) {
                    layoutListAdapter.e(i2);
                }
                this.f22514a.c(iArrE, listB, listG);
                return;
            }
            this.f22514a = new LayoutListAdapter(context, iArrE, listB, listG, i2, new LayoutListAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.LayoutContentViewHolder.4
                @Override // com.huawei.pluginsocialshare.adapter.LayoutListAdapter.OnItemClickListener
                public void onItemClick(int i3, int i4) {
                    int unused = StickerItemAdapter.f22510c = 2;
                    if (lrd.d()) {
                        LayoutContentViewHolder.this.f22516c.a(LayoutContentViewHolder.this.f22514a.a());
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i3, 0, i4, null, 0, null);
                    }
                }
            });
            this.f22515b.setNestedScrollingEnabled(false);
            this.f22515b.setAdapter(this.f22514a);
            c cVar = this.f22516c;
            if (cVar != null) {
                this.f22514a.d(cVar);
                qsp.a(this.f22515b, this.f22516c);
            }
        }
    }

    public static class StickerContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthRecycleView f22526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f22527b;
        private ShareStickerAdapter e;

        public void e(c cVar) {
            this.f22527b = cVar;
        }

        public StickerContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.f22526a = healthRecycleView;
            healthRecycleView.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), pns.e(), 1, false));
            this.f22526a.setTag(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Context context, List<pnc> list, int i, int i2, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<ShareDataInfo> listF = list.get(i).f();
            if (njy.e(listF)) {
                return;
            }
            ShareStickerAdapter shareStickerAdapter = this.e;
            if (shareStickerAdapter != null) {
                if (i2 == -1) {
                    shareStickerAdapter.e(i2);
                }
                this.e.b(listF);
                return;
            }
            this.e = new ShareStickerAdapter(context, listF, new ShareStickerAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.StickerContentViewHolder.3
                @Override // com.huawei.pluginsocialshare.adapter.ShareStickerAdapter.OnItemClickListener
                public void onItemClick(int i3, ShareDataInfo shareDataInfo) {
                    int unused = StickerItemAdapter.f22510c = 3;
                    if (lrd.d()) {
                        StickerContentViewHolder.this.f22527b.a((StickerContentViewHolder) StickerContentViewHolder.this.f22526a.getTag());
                        StickerContentViewHolder.this.f22527b.d(i3);
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i3, 0, -1, null, 0, shareDataInfo);
                    }
                }
            });
            this.f22526a.setNestedScrollingEnabled(false);
            this.f22526a.setAdapter(this.e);
            c cVar = this.f22527b;
            if (cVar != null) {
                this.e.b(cVar);
                qsp.a(this.f22526a, this.f22527b);
            }
        }

        public void d(final int i) {
            if (i < 0) {
                return;
            }
            this.f22526a.post(new Runnable() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.StickerContentViewHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = StickerContentViewHolder.this.f22526a.findViewHolderForAdapterPosition(i);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        viewHolderFindViewHolderForAdapterPosition.itemView.requestFocus();
                        lrd.b(viewHolderFindViewHolderForAdapterPosition.itemView, 8);
                    }
                }
            });
        }
    }

    public static class MaskContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthRecycleView f22522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f22523b;
        private ShareMaskAdapter d;

        public void c(c cVar) {
            this.f22523b = cVar;
        }

        public MaskContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.share_item_recycler_view);
            this.f22522a = healthRecycleView;
            healthRecycleView.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), pns.e(), 1, false));
            this.f22522a.setTag(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Context context, List<pnc> list, int i, final OnItemClickListener onItemClickListener) {
            if (njy.e(list, i)) {
                return;
            }
            List<pmx> listJ = list.get(i).j();
            if (njy.e(listJ)) {
                return;
            }
            ShareMaskAdapter shareMaskAdapter = this.d;
            if (shareMaskAdapter != null) {
                shareMaskAdapter.b(listJ);
                return;
            }
            this.d = new ShareMaskAdapter(context, listJ, new ShareMaskAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.adapter.StickerItemAdapter.MaskContentViewHolder.2
                @Override // com.huawei.pluginsocialshare.adapter.ShareMaskAdapter.OnItemClickListener
                public void onItemClick(int i2, pmx pmxVar) {
                    int unused = StickerItemAdapter.f22510c = 3;
                    if (lrd.d()) {
                        MaskContentViewHolder.this.f22523b.a((StickerContentViewHolder) MaskContentViewHolder.this.f22522a.getTag());
                        MaskContentViewHolder.this.f22523b.d(i2);
                    }
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i2, 0, -1, pmxVar, 0, null);
                    }
                }
            });
            this.f22522a.setNestedScrollingEnabled(false);
            this.f22522a.setAdapter(this.d);
            c cVar = this.f22523b;
            if (cVar != null) {
                this.d.e(cVar);
                qsp.a(this.f22522a, this.f22523b);
            }
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RecyclerView.ViewHolder f22531a;
        private int e;

        private c() {
        }

        public void d(int i) {
            if (i < 0) {
                return;
            }
            this.e = i;
        }

        public void a(RecyclerView.ViewHolder viewHolder) {
            this.f22531a = viewHolder;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView.ViewHolder viewHolder = this.f22531a;
            if (viewHolder == null) {
                return;
            }
            if ((viewHolder instanceof ColorListAdapter.HorizontalListItemViewHolder) && StickerItemAdapter.f22510c == 1) {
                lrd.b(this.f22531a.itemView, 8);
                int unused = StickerItemAdapter.f22510c = -1;
                this.f22531a = null;
            } else if ((this.f22531a instanceof LayoutListAdapter.HorizontalListItemViewHolder) && StickerItemAdapter.f22510c == 2) {
                lrd.b(this.f22531a.itemView, 8);
                int unused2 = StickerItemAdapter.f22510c = -1;
                this.f22531a = null;
            } else if ((this.f22531a instanceof StickerContentViewHolder) && StickerItemAdapter.f22510c == 3) {
                ((StickerContentViewHolder) this.f22531a).d(this.e);
                int unused3 = StickerItemAdapter.f22510c = -1;
                this.f22531a = null;
            }
        }
    }
}
