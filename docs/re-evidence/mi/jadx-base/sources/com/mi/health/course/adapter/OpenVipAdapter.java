package com.mi.health.course.adapter;

import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.adapter.OpenVipAdapter;
import com.mi.health.course.export.data.OpenVipModel;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.smarthome.utils.ExtsKt;
import defpackage.bli;
import defpackage.wv4;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/mi/health/course/adapter/OpenVipAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/OpenVipAdapter$Holder;", "vipList", "", "Lcom/mi/health/course/export/data/OpenVipModel;", "<init>", "(Ljava/util/List;)V", "getVipList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "formatNumber", "", RealNameWebViewActivity.NUMBER, "", "getItemCount", "clearState", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenVipAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final List<OpenVipModel> vipList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/mi/health/course/adapter/OpenVipAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bind", "(I)V", "Lwv4;", "Lwv4;", "getBind", "()Lwv4;", "<init>", "(Lcom/mi/health/course/adapter/OpenVipAdapter;Lwv4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nOpenVipAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenVipAdapter.kt\ncom/mi/health/course/adapter/OpenVipAdapter$Holder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n326#2,4:104\n256#2,2:108\n256#2,2:110\n774#3:112\n865#3,2:113\n2642#3:115\n1#4:116\n*S KotlinDebug\n*F\n+ 1 OpenVipAdapter.kt\ncom/mi/health/course/adapter/OpenVipAdapter$Holder\n*L\n40#1:104,4\n50#1:108,2\n64#1:110,2\n81#1:112\n81#1:113,2\n81#1:115\n81#1:116\n*E\n"})
    public final class Holder extends RecyclerView.d0 {

        @NotNull
        private final wv4 bind;
        final /* synthetic */ OpenVipAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull OpenVipAdapter openVipAdapter, wv4 bind) {
            super(bind.getRoot());
            Intrinsics.checkNotNullParameter(bind, "bind");
            this.this$0 = openVipAdapter;
            this.bind = bind;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$6(OpenVipModel openVipModel, OpenVipAdapter this$0, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            if (openVipModel == null || !Intrinsics.areEqual(openVipModel.getSelected(), Boolean.TRUE)) {
                List<OpenVipModel> vipList = this$0.getVipList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : vipList) {
                    if (Intrinsics.areEqual(((OpenVipModel) obj).getSelected(), Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((OpenVipModel) it2.next()).setSelected(Boolean.FALSE);
                }
                if (openVipModel != null) {
                    openVipModel.setSelected(Boolean.TRUE);
                }
                this$0.notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public final void bind(int position) {
            Long priceOld;
            Long priceOld2;
            Long price;
            String usage;
            final OpenVipModel openVipModel = (OpenVipModel) CollectionsKt___CollectionsKt.getOrNull(this.this$0.getVipList(), position);
            View root = this.bind.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            OpenVipAdapter openVipAdapter = this.this$0;
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            }
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(position == 0 ? ExtUtilsKt.getDp(15) : ExtUtilsKt.getDp(10));
            layoutParams2.setMarginEnd(position == CollectionsKt__CollectionsKt.getLastIndex(openVipAdapter.getVipList()) ? ExtUtilsKt.getDp(15) : 0);
            root.setLayoutParams(layoutParams2);
            TextView textView = this.bind.D;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(openVipModel != null && (usage = openVipModel.getUsage()) != null && usage.length() > 0 ? 0 : 8);
            textView.setText(openVipModel != null ? openVipModel.getUsage() : null);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(4));
            gradientDrawable.setColor(ExtUtilsKt.getColor(bli.h));
            textView.setBackground(gradientDrawable);
            this.bind.A.setText(openVipModel != null ? openVipModel.getName() : null);
            long jLongValue = 0;
            SpannableString spannableString = new SpannableString("￥" + this.this$0.formatNumber(((openVipModel == null || (price = openVipModel.getPrice()) == null) ? 0L : price.longValue()) / 100.0f));
            spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, 1, 17);
            this.bind.B.setText(spannableString);
            TextView textView2 = this.bind.C;
            OpenVipAdapter openVipAdapter2 = this.this$0;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(((openVipModel == null || (priceOld2 = openVipModel.getPriceOld()) == null) ? 0L : priceOld2.longValue()) > 0 ? 0 : 8);
            if (openVipModel != null && (priceOld = openVipModel.getPriceOld()) != null) {
                jLongValue = priceOld.longValue();
            }
            textView2.setText("￥" + openVipAdapter2.formatNumber(jLongValue / 100.0f));
            View view = this.bind.E;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius((float) ExtUtilsKt.getDp(7));
            gradientDrawable2.setStroke(ExtsKt.getDp(1.5f), ExtUtilsKt.getColor((openVipModel == null || !Intrinsics.areEqual(openVipModel.getSelected(), Boolean.TRUE)) ? bli.f4341k : bli.h));
            gradientDrawable2.setColor(ExtUtilsKt.getColor((openVipModel == null || !Intrinsics.areEqual(openVipModel.getSelected(), Boolean.TRUE)) ? bli.l : bli.i));
            view.setBackground(gradientDrawable2);
            View root2 = this.bind.getRoot();
            final OpenVipAdapter openVipAdapter3 = this.this$0;
            ViewExtKt.clickWithTrigger$default(root2, 0L, new Function1() { // from class: ebh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OpenVipAdapter.Holder.bind$lambda$6(openVipModel, openVipAdapter3, (View) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final wv4 getBind() {
            return this.bind;
        }
    }

    public OpenVipAdapter(@NotNull List<OpenVipModel> vipList) {
        Intrinsics.checkNotNullParameter(vipList, "vipList");
        this.vipList = vipList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clearState() {
        notifyDataSetChanged();
    }

    @NotNull
    public final String formatNumber(float number) {
        String str = new DecimalFormat("#.##").format(Float.valueOf(number));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.vipList.size();
    }

    @NotNull
    public final List<OpenVipModel> getVipList() {
        return this.vipList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        wv4 wv4VarA0 = wv4.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(wv4VarA0, "inflate(...)");
        return new Holder(this, wv4VarA0);
    }
}
