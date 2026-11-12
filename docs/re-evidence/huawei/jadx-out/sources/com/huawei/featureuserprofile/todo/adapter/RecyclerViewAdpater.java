package com.huawei.featureuserprofile.todo.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TextAppearanceSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.activity.OnItemClickListener;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.czv;
import defpackage.gcn;
import defpackage.ikw;
import defpackage.njy;
import defpackage.qli;
import defpackage.qqf;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class RecyclerViewAdpater extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f5748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ikw> f5749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f5750c;
    private OnItemClickListener<ikw> d;
    private GestureDetectorCompat e;

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void c(OnItemClickListener<ikw> onItemClickListener) {
        this.d = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f5748a == null) {
            this.f5748a = LayoutInflater.from(viewGroup.getContext());
        }
        if (this.e == null && (viewGroup instanceof RecyclerView)) {
            this.e = new GestureDetectorCompat(viewGroup.getContext(), new b((RecyclerView) viewGroup, this, this.d));
        }
        if (this.f5750c == null) {
            this.f5750c = viewGroup;
        }
        if (i == 1) {
            return new c(this.f5748a.inflate(R.layout.item_todo_list_recyclerview, (ViewGroup) null));
        }
        if (i == 2) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_6dp)));
            return new RecyclerHolder(view);
        }
        LogUtil.a("RecyclerViewAdpater", "error type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        if (!njy.e(this.f5749b, i) && (viewHolder instanceof c)) {
            c cVar = (c) viewHolder;
            cVar.c(this.f5749b.get(i));
            cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: czg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31523a.a(i, view);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, View view) {
        this.d.onItemClick(view, i, this.f5749b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f5749b) || i < 0 || i > this.f5749b.size()) {
            return -1;
        }
        return i == this.f5749b.size() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f5749b)) {
            return 0;
        }
        return this.f5749b.size() + 1;
    }

    public void b(List<ikw> list) {
        if (njy.b(list)) {
            if (this.f5749b == null) {
                this.f5749b = new ArrayList(list.size());
            }
            this.f5749b.clear();
            this.f5749b.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        GestureDetectorCompat gestureDetectorCompat = this.e;
        if (gestureDetectorCompat == null) {
            return false;
        }
        gestureDetectorCompat.onTouchEvent(motionEvent);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
    }

    static class b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OnItemClickListener<ikw> f5751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerViewAdpater f5752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final RecyclerView f5753c;

        b(RecyclerView recyclerView, RecyclerViewAdpater recyclerViewAdpater, OnItemClickListener<ikw> onItemClickListener) {
            this.f5753c = recyclerView;
            this.f5752b = recyclerViewAdpater;
            this.f5751a = onItemClickListener;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RecyclerView.ViewHolder childViewHolder;
            RecyclerView recyclerView = this.f5753c;
            if (recyclerView == null || this.f5752b == null || this.f5751a == null) {
                return false;
            }
            View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null && (childViewHolder = this.f5753c.getChildViewHolder(viewFindChildViewUnder)) != null && childViewHolder.getAdapterPosition() >= 0) {
                return true;
            }
            this.f5751a.onOtherClick();
            return true;
        }
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f5754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f5755b;
        HealthTextView e;

        private boolean e(int i) {
            return i == 256 || i == 512;
        }

        c(View view) {
            super(view);
        }

        public void c(ikw ikwVar) {
            this.f5754a = (ImageView) this.itemView.findViewById(R.id.todo_icon);
            this.e = (HealthTextView) this.itemView.findViewById(R.id.todo_name);
            this.f5755b = (HealthTextView) this.itemView.findViewById(R.id.todo_progress);
            a(this.f5754a, ikwVar);
            b(this.e, ikwVar);
            a(this.f5755b, ikwVar);
        }

        private void a(ImageView imageView, ikw ikwVar) {
            int i;
            int iconId;
            if (imageView == null || ikwVar == null) {
                return;
            }
            int iL = ikwVar.l();
            imageView.setBackgroundResource(R.color.transparent);
            if (ikwVar.d() > 0) {
                iconId = ikwVar.d();
            } else if (e(iL)) {
                iconId = ikwVar.n().getIconId();
            } else {
                if (iL == 768) {
                    try {
                        i = Integer.parseInt(czv.a(BleConstants.SPORT_TYPE, ikwVar.k()));
                    } catch (NumberFormatException e) {
                        LogUtil.e("RecyclerViewAdpater", "setIcon Exception = ", ExceptionUtils.c(e));
                        i = 258;
                    }
                    Drawable drawableAcquireSportTypeDrawable = gcn.c().acquireSportTypeDrawable(i);
                    Context context = BaseApplication.getContext();
                    imageView.setBackground(qqf.c(context.getDrawable(R.drawable.sport_icon_bg), context.getColor(R.color.common_colorAccent)));
                    imageView.setImageDrawable(drawableAcquireSportTypeDrawable);
                    return;
                }
                iconId = R.drawable.ic_todo_activity;
            }
            imageView.setImageResource(iconId);
        }

        private void b(HealthTextView healthTextView, ikw ikwVar) {
            if (healthTextView == null || ikwVar == null) {
                LogUtil.j("RecyclerViewAdpater", "initTitle textView or bean is null");
            } else {
                healthTextView.setText(ikwVar.o());
            }
        }

        private void a(HealthTextView healthTextView, ikw ikwVar) {
            if (healthTextView == null || ikwVar == null) {
                LogUtil.j("RecyclerViewAdpater", "initValue textView or bean is null");
            } else {
                if (!TextUtils.isEmpty(ikwVar.i())) {
                    healthTextView.setVisibility(0);
                    healthTextView.setText(c(ikwVar.i()));
                    healthTextView.setLayoutDirection(LanguageUtil.ba(healthTextView.getContext()) ? 1 : 0);
                    return;
                }
                healthTextView.setVisibility(8);
            }
        }

        private SpannableString c(CharSequence charSequence) {
            LogUtil.a("RecyclerViewAdpater", charSequence);
            Context context = this.itemView.getContext();
            SpannableString spannableString = new SpannableString(charSequence);
            int length = spannableString.length();
            spannableString.setSpan(new TextAppearanceSpan(this.itemView.getContext(), R.style.health_todo_suffix_style), 0, length, 18);
            String[] strArrSplit = charSequence.toString().split("/");
            int length2 = strArrSplit[0].length();
            if (length2 == 0) {
                length2 = length;
            }
            boolean z = length2 == length || "--".equals(strArrSplit[0]);
            if (length2 <= length) {
                spannableString.setSpan(new TextAppearanceSpan(context, R.style.health_todo_prefix_style), 0, length2, 17);
                spannableString.setSpan(new AbsoluteSizeSpan(qrs.e(context, context.getResources().getDimensionPixelSize(z ? R.dimen.textSizeBody1 : R.dimen.textSizeHeadline8)), true), 0, length2, 17);
            }
            spannableString.setSpan(new qli(qrr.c()), 0, length, 17);
            LogUtil.a("RecyclerViewAdpater", spannableString.toString());
            return spannableString;
        }
    }
}
