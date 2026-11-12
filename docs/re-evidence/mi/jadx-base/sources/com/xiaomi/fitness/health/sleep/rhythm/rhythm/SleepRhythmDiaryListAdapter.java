package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.app.Application;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.h62;
import defpackage.ili;
import defpackage.jui;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepDiaryTransform;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "setDataList", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "SleepDiaryTransform", "SleepRhythmDiaryListViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmDiaryListAdapter extends RecyclerView.Adapter<SleepRhythmDiaryListViewHolder> {

    @NotNull
    private List<SleepDiaryTransform> dataList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepDiaryTransform;", "", "medicationHeight", "", "napSituationHeight", "fallAsleepAgainDurationHeight", "report", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "<init>", "(IIILcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;)V", "getMedicationHeight", "()I", "getNapSituationHeight", "getFallAsleepAgainDurationHeight", "getReport", "()Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepDiaryTransform {
        private final int fallAsleepAgainDurationHeight;
        private final int medicationHeight;
        private final int napSituationHeight;

        @Nullable
        private final SleepDiaryReport report;

        public SleepDiaryTransform(int i, int i2, int i3, @Nullable SleepDiaryReport sleepDiaryReport) {
            this.medicationHeight = i;
            this.napSituationHeight = i2;
            this.fallAsleepAgainDurationHeight = i3;
            this.report = sleepDiaryReport;
        }

        public static /* synthetic */ SleepDiaryTransform copy$default(SleepDiaryTransform sleepDiaryTransform, int i, int i2, int i3, SleepDiaryReport sleepDiaryReport, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = sleepDiaryTransform.medicationHeight;
            }
            if ((i4 & 2) != 0) {
                i2 = sleepDiaryTransform.napSituationHeight;
            }
            if ((i4 & 4) != 0) {
                i3 = sleepDiaryTransform.fallAsleepAgainDurationHeight;
            }
            if ((i4 & 8) != 0) {
                sleepDiaryReport = sleepDiaryTransform.report;
            }
            return sleepDiaryTransform.copy(i, i2, i3, sleepDiaryReport);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMedicationHeight() {
            return this.medicationHeight;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getNapSituationHeight() {
            return this.napSituationHeight;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFallAsleepAgainDurationHeight() {
            return this.fallAsleepAgainDurationHeight;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final SleepDiaryReport getReport() {
            return this.report;
        }

        @NotNull
        public final SleepDiaryTransform copy(int medicationHeight, int napSituationHeight, int fallAsleepAgainDurationHeight, @Nullable SleepDiaryReport report) {
            return new SleepDiaryTransform(medicationHeight, napSituationHeight, fallAsleepAgainDurationHeight, report);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepDiaryTransform)) {
                return false;
            }
            SleepDiaryTransform sleepDiaryTransform = (SleepDiaryTransform) other;
            return this.medicationHeight == sleepDiaryTransform.medicationHeight && this.napSituationHeight == sleepDiaryTransform.napSituationHeight && this.fallAsleepAgainDurationHeight == sleepDiaryTransform.fallAsleepAgainDurationHeight && Intrinsics.areEqual(this.report, sleepDiaryTransform.report);
        }

        public final int getFallAsleepAgainDurationHeight() {
            return this.fallAsleepAgainDurationHeight;
        }

        public final int getMedicationHeight() {
            return this.medicationHeight;
        }

        public final int getNapSituationHeight() {
            return this.napSituationHeight;
        }

        @Nullable
        public final SleepDiaryReport getReport() {
            return this.report;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.medicationHeight) * 31) + Integer.hashCode(this.napSituationHeight)) * 31) + Integer.hashCode(this.fallAsleepAgainDurationHeight)) * 31;
            SleepDiaryReport sleepDiaryReport = this.report;
            return iHashCode + (sleepDiaryReport == null ? 0 : sleepDiaryReport.hashCode());
        }

        @NotNull
        public String toString() {
            return "SleepDiaryTransform(medicationHeight=" + this.medicationHeight + ", napSituationHeight=" + this.napSituationHeight + ", fallAsleepAgainDurationHeight=" + this.fallAsleepAgainDurationHeight + ", report=" + this.report + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepDiaryTransform;", "transform", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepDiaryTransform;I)V", "Landroid/widget/TextView;", "timeTV", "Landroid/widget/TextView;", "sleepInDayTimeTV", "Landroidx/recyclerview/widget/RecyclerView;", "sleepInDayTimeRV", "Landroidx/recyclerview/widget/RecyclerView;", "sleepMedicationTV", "sleepMedicationRV", "lightOffTimeTV", "lightOffToSleepTimeTV", "wakeUpCountTV", "wakeUpTimeInNightTV", "wakeUpTimeInNightRV", "wakeUpTimeInDayTV", "getUpTimeInDayTV", "difficultyTV", "feelingTV", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;Landroid/view/View;)V", "SpaceItemDecoration", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepRhythmDiaryListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmDiaryListAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,335:1\n1863#2,2:336\n1863#2,2:338\n1863#2,2:340\n*S KotlinDebug\n*F\n+ 1 SleepRhythmDiaryListAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder\n*L\n209#1:336,2\n238#1:338,2\n287#1:340,2\n*E\n"})
    public final class SleepRhythmDiaryListViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView difficultyTV;

        @NotNull
        private TextView feelingTV;

        @NotNull
        private TextView getUpTimeInDayTV;

        @NotNull
        private TextView lightOffTimeTV;

        @NotNull
        private TextView lightOffToSleepTimeTV;

        @NotNull
        private RecyclerView sleepInDayTimeRV;

        @NotNull
        private TextView sleepInDayTimeTV;

        @NotNull
        private RecyclerView sleepMedicationRV;

        @NotNull
        private TextView sleepMedicationTV;
        final /* synthetic */ SleepRhythmDiaryListAdapter this$0;

        @NotNull
        private TextView timeTV;

        @NotNull
        private TextView wakeUpCountTV;

        @NotNull
        private TextView wakeUpTimeInDayTV;

        @NotNull
        private RecyclerView wakeUpTimeInNightRV;

        @NotNull
        private TextView wakeUpTimeInNightTV;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder$SpaceItemDecoration;", "Lh62;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getCustomItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepRhythmDiaryListViewHolder;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class SpaceItemDecoration extends h62 {
            public SpaceItemDecoration() {
            }

            @Override // defpackage.h62
            public void getCustomItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getCustomItemOffsets(outRect, view, parent, state);
                parent.getChildAdapterPosition(view);
                parent.getChildCount();
                outRect.top = AppUtil.getApp().getResources().getDimensionPixelSize(ili.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmDiaryListViewHolder(@NotNull SleepRhythmDiaryListAdapter sleepRhythmDiaryListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmDiaryListAdapter;
            this.timeTV = (TextView) itemView.findViewById(eri.rg);
            this.sleepInDayTimeTV = (TextView) itemView.findViewById(eri.og);
            this.sleepInDayTimeRV = (RecyclerView) itemView.findViewById(eri.ng);
            this.sleepMedicationTV = (TextView) itemView.findViewById(eri.lg);
            this.sleepMedicationRV = (RecyclerView) itemView.findViewById(eri.kg);
            this.lightOffTimeTV = (TextView) itemView.findViewById(eri.qg);
            this.lightOffToSleepTimeTV = (TextView) itemView.findViewById(eri.sg);
            this.wakeUpCountTV = (TextView) itemView.findViewById(eri.zg);
            this.wakeUpTimeInNightTV = (TextView) itemView.findViewById(eri.L6);
            this.wakeUpTimeInNightRV = (RecyclerView) itemView.findViewById(eri.K6);
            this.wakeUpTimeInDayTV = (TextView) itemView.findViewById(eri.i6);
            this.getUpTimeInDayTV = (TextView) itemView.findViewById(eri.g6);
            this.difficultyTV = (TextView) itemView.findViewById(eri.r6);
            this.feelingTV = (TextView) itemView.findViewById(eri.v6);
            this.sleepInDayTimeRV.addItemDecoration(new SpaceItemDecoration());
            this.sleepMedicationRV.addItemDecoration(new SpaceItemDecoration());
            this.wakeUpTimeInNightRV.addItemDecoration(new SpaceItemDecoration());
        }

        public final void bindData(@NotNull SleepDiaryTransform transform, int position) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            SleepDiaryReport report = transform.getReport();
            if (report == null || position == 0) {
                this.timeTV.setText("");
                this.timeTV.setTypeface(Typeface.create("mipro-regular", 1));
                ExtUtilKt.visible(this.sleepInDayTimeTV);
                ExtUtilKt.gone(this.sleepInDayTimeRV);
                this.sleepInDayTimeTV.setText(ExtUtilKt.getString(c0j.wq));
                ViewGroup.LayoutParams layoutParams = this.sleepInDayTimeTV.getLayoutParams();
                layoutParams.height = transform.getNapSituationHeight();
                this.sleepInDayTimeTV.setLayoutParams(layoutParams);
                ExtUtilKt.visible(this.sleepMedicationTV);
                ExtUtilKt.gone(this.sleepMedicationRV);
                this.sleepMedicationTV.setText(ExtUtilKt.getString(c0j.E));
                ViewGroup.LayoutParams layoutParams2 = this.sleepMedicationTV.getLayoutParams();
                layoutParams2.height = transform.getMedicationHeight();
                this.sleepMedicationTV.setLayoutParams(layoutParams2);
                ExtUtilKt.visible(this.wakeUpTimeInNightTV);
                ExtUtilKt.gone(this.wakeUpTimeInNightRV);
                this.wakeUpTimeInNightTV.setText(ExtUtilKt.getString(c0j.Qo));
                this.lightOffTimeTV.setText(ExtUtilKt.getString(c0j.mf));
                this.lightOffToSleepTimeTV.setText(ExtUtilKt.getString(c0j.nf));
                this.wakeUpCountTV.setText(ExtUtilKt.getString(c0j.Di));
                this.wakeUpTimeInDayTV.setText(ExtUtilKt.getString(c0j.lf));
                this.getUpTimeInDayTV.setText(ExtUtilKt.getString(c0j.f1if));
                this.difficultyTV.setText(ExtUtilKt.getString(c0j.vf));
                this.feelingTV.setText(ExtUtilKt.getString(c0j.Of));
                ViewGroup.LayoutParams layoutParams3 = this.wakeUpTimeInNightTV.getLayoutParams();
                layoutParams3.height = transform.getFallAsleepAgainDurationHeight();
                this.wakeUpTimeInNightTV.setLayoutParams(layoutParams3);
                return;
            }
            this.timeTV.setTypeface(Typeface.create("mipro-regular", 0));
            long j = 1000;
            this.timeTV.setText(TimeDateUtil.getDateFormated(report.getTime() * j, StringUtils.EXPECT_DATE_FORMAT));
            ViewGroup.LayoutParams layoutParams4 = this.sleepInDayTimeRV.getLayoutParams();
            layoutParams4.height = transform.getNapSituationHeight();
            this.sleepInDayTimeRV.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.sleepInDayTimeTV.getLayoutParams();
            layoutParams5.height = transform.getNapSituationHeight();
            this.sleepInDayTimeTV.setLayoutParams(layoutParams5);
            ViewGroup.LayoutParams layoutParams6 = this.sleepMedicationRV.getLayoutParams();
            layoutParams6.height = transform.getMedicationHeight();
            this.sleepMedicationRV.setLayoutParams(layoutParams6);
            ViewGroup.LayoutParams layoutParams7 = this.sleepMedicationTV.getLayoutParams();
            layoutParams7.height = transform.getMedicationHeight();
            this.sleepMedicationTV.setLayoutParams(layoutParams7);
            ViewGroup.LayoutParams layoutParams8 = this.wakeUpTimeInNightRV.getLayoutParams();
            layoutParams8.height = transform.getFallAsleepAgainDurationHeight();
            this.wakeUpTimeInNightRV.setLayoutParams(layoutParams8);
            ViewGroup.LayoutParams layoutParams9 = this.wakeUpTimeInNightTV.getLayoutParams();
            layoutParams9.height = transform.getFallAsleepAgainDurationHeight();
            this.wakeUpTimeInNightTV.setLayoutParams(layoutParams9);
            List<SleepNapSituation> napSituation = report.getNapSituation();
            if (napSituation == null || napSituation.isEmpty()) {
                ExtUtilKt.gone(this.sleepInDayTimeRV);
                ExtUtilKt.visible(this.sleepInDayTimeTV);
                this.sleepInDayTimeTV.setText(ExtUtilKt.getString(c0j.vq));
            } else {
                ExtUtilKt.visible(this.sleepInDayTimeRV);
                ExtUtilKt.gone(this.sleepInDayTimeTV);
                ArrayList arrayList = new ArrayList();
                List<SleepNapSituation> napSituation2 = report.getNapSituation();
                Intrinsics.checkNotNull(napSituation2);
                for (SleepNapSituation sleepNapSituation : napSituation2) {
                    arrayList.add(new SleepRhythmBaseItemListAdapter.SleepRhythmBaseListItem(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepNapSituation.getBedtime() * j)) + "-" + TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepNapSituation.getWakeUpTime() * j)), null, null));
                }
                SleepRhythmBaseItemListAdapter sleepRhythmBaseItemListAdapter = new SleepRhythmBaseItemListAdapter(new ArrayList());
                this.sleepInDayTimeRV.setAdapter(sleepRhythmBaseItemListAdapter);
                sleepRhythmBaseItemListAdapter.updateDataList(arrayList);
            }
            List<SleepMedicationDetail> medicationBeforeBedtime = report.getMedicationBeforeBedtime();
            if (medicationBeforeBedtime == null || medicationBeforeBedtime.isEmpty()) {
                ExtUtilKt.gone(this.sleepMedicationRV);
                ExtUtilKt.visible(this.sleepMedicationTV);
                this.sleepMedicationTV.setText(ExtUtilKt.getString(c0j.uq));
            } else {
                ExtUtilKt.visible(this.sleepMedicationRV);
                ExtUtilKt.gone(this.sleepMedicationTV);
                ArrayList arrayList2 = new ArrayList();
                List<SleepMedicationDetail> medicationBeforeBedtime2 = report.getMedicationBeforeBedtime();
                Intrinsics.checkNotNull(medicationBeforeBedtime2);
                for (SleepMedicationDetail sleepMedicationDetail : medicationBeforeBedtime2) {
                    arrayList2.add(new SleepRhythmBaseItemListAdapter.SleepRhythmBaseListItem(sleepMedicationDetail.getMedicationName(), ExtUtilKt.getString(c0j.Q9) + ":" + TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepMedicationDetail.getMedicationSchedule() * j)), ExtUtilKt.getString(c0j.L9) + ":" + sleepMedicationDetail.getMedicationCount()));
                }
                SleepRhythmBaseItemListAdapter sleepRhythmBaseItemListAdapter2 = new SleepRhythmBaseItemListAdapter(new ArrayList());
                this.sleepMedicationRV.setAdapter(sleepRhythmBaseItemListAdapter2);
                sleepRhythmBaseItemListAdapter2.updateDataList(arrayList2);
            }
            if (report.getPreSleepRoutineTime() != null) {
                TextView textView = this.lightOffTimeTV;
                Long preSleepRoutineTime = report.getPreSleepRoutineTime();
                Intrinsics.checkNotNull(preSleepRoutineTime);
                textView.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(preSleepRoutineTime.longValue() * j)));
            }
            if (report.getFallAsleepDuration() != null) {
                TextView textView2 = this.lightOffToSleepTimeTV;
                Application application = ApplicationExtKt.getApplication();
                int i = qxi.R1;
                Integer fallAsleepDuration = report.getFallAsleepDuration();
                Intrinsics.checkNotNull(fallAsleepDuration);
                int iIntValue = fallAsleepDuration.intValue();
                Integer fallAsleepDuration2 = report.getFallAsleepDuration();
                Intrinsics.checkNotNull(fallAsleepDuration2);
                textView2.setText(ResourceExtKt.getQuantityString(application, i, iIntValue, fallAsleepDuration2));
            } else {
                this.lightOffToSleepTimeTV.setText("");
            }
            List<Integer> fallAsleepAgainDuration = report.getFallAsleepAgainDuration();
            if (fallAsleepAgainDuration == null || fallAsleepAgainDuration.isEmpty()) {
                this.wakeUpCountTV.setText(ExtUtilKt.getString(c0j.Pj));
            } else {
                TextView textView3 = this.wakeUpCountTV;
                List<Integer> fallAsleepAgainDuration2 = report.getFallAsleepAgainDuration();
                textView3.setText(String.valueOf(fallAsleepAgainDuration2 != null ? Integer.valueOf(fallAsleepAgainDuration2.size()) : null));
            }
            if (report.getFallAsleepAgainDuration() != null) {
                ExtUtilKt.gone(this.wakeUpTimeInNightTV);
                ExtUtilKt.visible(this.wakeUpTimeInNightRV);
                ArrayList arrayList3 = new ArrayList();
                List<Integer> fallAsleepAgainDuration3 = report.getFallAsleepAgainDuration();
                Intrinsics.checkNotNull(fallAsleepAgainDuration3);
                Iterator<T> it = fallAsleepAgainDuration3.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Number) it.next()).intValue();
                    String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.R1, iIntValue2, Integer.valueOf(iIntValue2));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    arrayList3.add(new SleepRhythmBaseItemListAdapter.SleepRhythmBaseListItem(quantityString, null, null));
                }
                SleepRhythmBaseItemListAdapter sleepRhythmBaseItemListAdapter3 = new SleepRhythmBaseItemListAdapter(new ArrayList());
                this.wakeUpTimeInNightRV.setAdapter(sleepRhythmBaseItemListAdapter3);
                sleepRhythmBaseItemListAdapter3.updateDataList(arrayList3);
            } else {
                ExtUtilKt.gone(this.wakeUpTimeInNightRV);
                ExtUtilKt.visible(this.wakeUpTimeInNightTV);
                this.wakeUpTimeInNightTV.setText(ExtUtilKt.getString(c0j.Pj));
            }
            if (report.getMorningWakeUpTime() != null) {
                TextView textView4 = this.wakeUpTimeInDayTV;
                Long morningWakeUpTime = report.getMorningWakeUpTime();
                Intrinsics.checkNotNull(morningWakeUpTime);
                textView4.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningWakeUpTime.longValue() * j)));
            } else {
                this.wakeUpTimeInDayTV.setText("");
            }
            if (report.getMorningGettingUpTime() != null) {
                TextView textView5 = this.getUpTimeInDayTV;
                Long morningGettingUpTime = report.getMorningGettingUpTime();
                Intrinsics.checkNotNull(morningGettingUpTime);
                textView5.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningGettingUpTime.longValue() * j)));
            } else {
                this.getUpTimeInDayTV.setText("");
            }
            TextView textView6 = this.difficultyTV;
            Integer insomniaDifficulty = report.getInsomniaDifficulty();
            textView6.setText(String.valueOf(insomniaDifficulty != null ? insomniaDifficulty.intValue() : 0));
            TextView textView7 = this.feelingTV;
            Integer sleepQuality = report.getSleepQuality();
            textView7.setText(String.valueOf(sleepQuality != null ? sleepQuality.intValue() : 0));
        }
    }

    public SleepRhythmDiaryListAdapter(@NotNull List<SleepDiaryTransform> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<SleepDiaryTransform> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<SleepDiaryTransform> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void updateDataList(@NotNull List<SleepDiaryTransform> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmDiaryListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        SleepDiaryTransform sleepDiaryTransform = this.dataList.get(position);
        if (position != 0) {
            layoutParams2.setMargins(ExtUtilsKt.getDp(Float.valueOf(-1.0f)), 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        holder.bindData(sleepDiaryTransform, position);
        holder.itemView.setLayoutParams(layoutParams2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmDiaryListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.H4, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmDiaryListViewHolder(this, viewInflate);
    }
}
