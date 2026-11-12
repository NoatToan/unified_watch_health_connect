package com.xiaomi.fitness.health.ecg;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.ecg.EcgSymptomChoiceDialog;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.nuf;
import defpackage.ohi;
import defpackage.pni;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J&\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010%\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\u0014\u0010'\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\u000e\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mAdapter", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "dialogLabelModel", "Lcom/xiaomi/fitness/health/ecg/DialogLabelModel;", "dialogLabelModelSituation", "dialogLabelModelTime", "ecgDialogFragmentList", "", "labelListBackString", "", "", "labelSituationBackString", "labelTimeBackPosition", "labelListSelectString", "labelSituationSelectString", "labelTimeSelectPosition", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onShow", LifecycleConstantKt.ON_RESUME, "initCustomView", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setSymptomList", "value", "setSituationList", "setTimePosition", "Companion", "Builder", "CustomAdapter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgSymptomChoiceDialog extends CommonDialog<DialogParams> {

    @NotNull
    public static final String KEY_SELECTED_LABEL = "selected_label";

    @NotNull
    public static final String KEY_SELECTED_LABEL_SITUATION = "selected_label_situation";

    @NotNull
    public static final String KEY_SELECTED_LABEL_TIME = "selected_label_time";

    @NotNull
    public static final String TAG = "EcgSymptomDialog";

    @Nullable
    private DialogLabelModel dialogLabelModel;

    @Nullable
    private DialogLabelModel dialogLabelModelSituation;

    @Nullable
    private DialogLabelModel dialogLabelModelTime;

    @Nullable
    private List<DialogLabelModel> ecgDialogFragmentList;

    @Nullable
    private CustomAdapter mAdapter;

    @Nullable
    private LinearLayoutManager mLayoutManager;

    @NotNull
    private List<Integer> labelListBackString = new ArrayList();

    @NotNull
    private List<Integer> labelSituationBackString = new ArrayList();
    private int labelTimeBackPosition = -1;

    @NotNull
    private List<Integer> labelListSelectString = new ArrayList();

    @NotNull
    private List<Integer> labelSituationSelectString = new ArrayList();
    private int labelTimeSelectPosition = -1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog;", "getThis", "()Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/baseui/dialog/DialogParams;)V", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, EcgSymptomChoiceDialog> {

        @NotNull
        private static final String DIALOG_NAME = "body_type";

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull DialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        public Builder() {
            this(new DialogParams(DIALOG_NAME));
            setCustomLayoutId(jui.m8);
            setNegativeText(c0j.c);
            setPositiveText(c0j.e);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public EcgSymptomChoiceDialog internalCreate() {
            return new EcgSymptomChoiceDialog();
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003'()B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016JF\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\"\u001a\u00020\u000fJ\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u0010&\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$CustomVH;", "<init>", "()V", "mRecommendationLabelModel", "", "Lcom/xiaomi/fitness/health/ecg/DialogLabelModel;", "titleItems", "", "labelTimeString", "customAdapterChild", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter;", "selectedPositionList", "", "", "labelSituationList", "labelTimePosition", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "", "holder", "position", "getItemId", "", "refreshRecommendationLabelLayout", "recommendationLabelModel", "EcgDialogFragmentTitle", "labelListBackString", "labelSituationBackString", "labelTimeBackPosition", "updateRecommendationLabelModel", "getLabelListValue", "getLabelSituationValue", "getLabelTimeString", "CustomVH", "ChildAdapter", "OnItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CustomAdapter extends RecyclerView.Adapter<CustomVH> {

        @Nullable
        private ChildAdapter customAdapterChild;
        private int labelTimePosition;

        @Nullable
        private List<DialogLabelModel> mRecommendationLabelModel;

        @Nullable
        private List<String> titleItems;

        @NotNull
        private String labelTimeString = "";

        @NotNull
        private List<Integer> selectedPositionList = new ArrayList();

        @NotNull
        private List<Integer> labelSituationList = new ArrayList();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nJ$\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010$\u001a\u00020\fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\bJ\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004H\u0016J\u001c\u0010)\u001a\u00020\u001f2\n\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u001c\u0010-\u001a\u00020\u001f2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020\u0004H\u0002J\u001c\u0010/\u001a\u00020\u001f2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020\u0019H\u0002J\u000e\u00100\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0019R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter$ChildViewHolder;", "parentIndex", "", "<init>", "(I)V", "mRecommendationLabelModel", "Lcom/xiaomi/fitness/health/ecg/DialogLabelModel;", "mOnItemClickListener", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$OnItemClickListener;", "setFlag", "", "selectedPosition", "", "getSelectedPosition", "()Ljava/util/List;", "setSelectedPosition", "(Ljava/util/List;)V", "getParentIndex", "()Ljava/lang/Integer;", "setParentIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "signalSelectedPosition", "", "getSignalSelectedPosition", "()Ljava/lang/String;", "setSignalSelectedPosition", "(Ljava/lang/String;)V", "setOnItemClickListener", "", "onItemClickListener", "refreshRecommendationLabelLayout", "recommendationLabelModel", "selectedPositionList", "flag", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "setSelectedStyle", "viewHolder", "setSignSelectedStyle", "isPositionAlreadySelected", "ChildViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ChildAdapter extends RecyclerView.Adapter<ChildViewHolder> {

            @Nullable
            private OnItemClickListener mOnItemClickListener;

            @Nullable
            private DialogLabelModel mRecommendationLabelModel;

            @Nullable
            private Integer parentIndex;

            @NotNull
            private List<Integer> selectedPosition = new ArrayList();
            private boolean setFlag;

            @Nullable
            private String signalSelectedPosition;

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter$ChildViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter;", "recommendationLabelViewHolder", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter$ChildViewHolder;I)V", "Landroid/widget/TextView;", "textLabelTv", "Landroid/widget/TextView;", "getTextLabelTv", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$ChildAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
            public final class ChildViewHolder extends RecyclerView.d0 {

                @NotNull
                private final TextView textLabelTv;
                final /* synthetic */ ChildAdapter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ChildViewHolder(@NotNull ChildAdapter childAdapter, View itemView) {
                    super(itemView);
                    Intrinsics.checkNotNullParameter(itemView, "itemView");
                    this.this$0 = childAdapter;
                    View viewFindViewById = itemView.findViewById(eri.y9);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    this.textLabelTv = (TextView) viewFindViewById;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void bindData$lambda$0(ChildAdapter this$0, int i, ChildViewHolder recommendationLabelViewHolder, String choiceLabelString, View view) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(recommendationLabelViewHolder, "$recommendationLabelViewHolder");
                    Intrinsics.checkNotNullParameter(choiceLabelString, "$choiceLabelString");
                    if (this$0.setFlag) {
                        if (this$0.getSelectedPosition().contains(Integer.valueOf(i))) {
                            this$0.getSelectedPosition().remove(Integer.valueOf(i));
                        } else {
                            this$0.getSelectedPosition().add(Integer.valueOf(i));
                        }
                    }
                    Logger.i(EcgSymptomChoiceDialog.TAG, "selectedPosition" + this$0.getSelectedPosition());
                    Integer parentIndex = this$0.getParentIndex();
                    if (parentIndex == null || parentIndex.intValue() != 2) {
                        this$0.setSelectedStyle(recommendationLabelViewHolder, i);
                    }
                    OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
                    if (onItemClickListener != null) {
                        Integer parentIndex2 = this$0.getParentIndex();
                        Intrinsics.checkNotNull(parentIndex2);
                        onItemClickListener.onItemClick(view, choiceLabelString, parentIndex2.intValue(), i);
                    }
                }

                public final void bindData(@NotNull final ChildViewHolder recommendationLabelViewHolder, final int position) {
                    Intrinsics.checkNotNullParameter(recommendationLabelViewHolder, "recommendationLabelViewHolder");
                    if (this.this$0.mRecommendationLabelModel == null) {
                        return;
                    }
                    DialogLabelModel dialogLabelModel = this.this$0.mRecommendationLabelModel;
                    Intrinsics.checkNotNull(dialogLabelModel);
                    final String str = dialogLabelModel.getDialogLabels().get(position);
                    this.textLabelTv.setText(str);
                    Integer parentIndex = this.this$0.getParentIndex();
                    if (parentIndex != null && parentIndex.intValue() == 2) {
                        this.this$0.setSignSelectedStyle(recommendationLabelViewHolder, str);
                    } else {
                        this.this$0.setSelectedStyle(recommendationLabelViewHolder, position);
                    }
                    if (this.this$0.mOnItemClickListener != null) {
                        nuf.f(this.textLabelTv);
                        TextView textView = this.textLabelTv;
                        final ChildAdapter childAdapter = this.this$0;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: lc7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                EcgSymptomChoiceDialog.CustomAdapter.ChildAdapter.ChildViewHolder.bindData$lambda$0(childAdapter, position, recommendationLabelViewHolder, str, view);
                            }
                        });
                    }
                }

                @NotNull
                public final TextView getTextLabelTv() {
                    return this.textLabelTv;
                }
            }

            public ChildAdapter(int i) {
                this.parentIndex = Integer.valueOf(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setSelectedStyle(ChildViewHolder viewHolder, int position) {
                if (this.selectedPosition.contains(Integer.valueOf(position))) {
                    viewHolder.itemView.setBackgroundResource(pni.v);
                    viewHolder.getTextLabelTv().setTextColor(ExtUtilsKt.getColor(iji.f21231r));
                } else {
                    viewHolder.itemView.setBackgroundResource(pni.M2);
                    viewHolder.getTextLabelTv().setTextColor(ExtUtilsKt.getColor(iji.r3));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setSignSelectedStyle(ChildViewHolder viewHolder, String position) {
                DialogLabelModel dialogLabelModel = this.mRecommendationLabelModel;
                if (Intrinsics.areEqual(position, dialogLabelModel != null ? dialogLabelModel.getDialogSelectedPosition() : null)) {
                    viewHolder.itemView.setBackgroundResource(pni.v);
                    viewHolder.getTextLabelTv().setTextColor(ExtUtilsKt.getColor(iji.f21231r));
                } else {
                    viewHolder.itemView.setBackgroundResource(pni.M2);
                    viewHolder.getTextLabelTv().setTextColor(ExtUtilsKt.getColor(iji.r3));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            /* JADX INFO: renamed from: getItemCount */
            public int getCount() {
                List<String> dialogLabels;
                DialogLabelModel dialogLabelModel = this.mRecommendationLabelModel;
                if (dialogLabelModel == null || (dialogLabels = dialogLabelModel.getDialogLabels()) == null) {
                    return 0;
                }
                return dialogLabels.size();
            }

            @Nullable
            public final Integer getParentIndex() {
                return this.parentIndex;
            }

            @NotNull
            public final List<Integer> getSelectedPosition() {
                return this.selectedPosition;
            }

            @Nullable
            public final String getSignalSelectedPosition() {
                return this.signalSelectedPosition;
            }

            public final boolean isPositionAlreadySelected(@NotNull String position) {
                Intrinsics.checkNotNullParameter(position, "position");
                return Intrinsics.areEqual(this.signalSelectedPosition, position);
            }

            public final void refreshRecommendationLabelLayout(@NotNull DialogLabelModel recommendationLabelModel, @NotNull List<Integer> selectedPositionList, boolean flag) {
                Intrinsics.checkNotNullParameter(recommendationLabelModel, "recommendationLabelModel");
                Intrinsics.checkNotNullParameter(selectedPositionList, "selectedPositionList");
                this.mRecommendationLabelModel = recommendationLabelModel;
                this.setFlag = flag;
                if (flag) {
                    this.selectedPosition = selectedPositionList;
                }
                notifyDataSetChanged();
            }

            public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
                Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
                this.mOnItemClickListener = onItemClickListener;
            }

            public final void setParentIndex(@Nullable Integer num) {
                this.parentIndex = num;
            }

            public final void setSelectedPosition(@NotNull List<Integer> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.selectedPosition = list;
            }

            public final void setSignalSelectedPosition(@Nullable String str) {
                this.signalSelectedPosition = str;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(@NotNull ChildViewHolder holder, int position) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                holder.bindData(holder, position);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            @NotNull
            public ChildViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.l8, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new ChildViewHolder(this, viewInflate);
            }

            public final void refreshRecommendationLabelLayout(@NotNull DialogLabelModel recommendationLabelModel) {
                Intrinsics.checkNotNullParameter(recommendationLabelModel, "recommendationLabelModel");
                this.mRecommendationLabelModel = recommendationLabelModel;
                notifyDataSetChanged();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$CustomVH;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "parentPosition", "", "bindData", "(I)V", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "recycleTv", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycleTv", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class CustomVH extends RecyclerView.d0 {

            @NotNull
            private final RecyclerView recycleTv;
            final /* synthetic */ CustomAdapter this$0;

            @NotNull
            private final TextView titleTv;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomVH(@NotNull CustomAdapter customAdapter, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = customAdapter;
                View viewFindViewById = itemView.findViewById(eri.O3);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.titleTv = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(eri.Md);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.recycleTv = (RecyclerView) viewFindViewById2;
            }

            public final void bindData(int parentPosition) {
                DialogLabelModel dialogLabelModel;
                final FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.itemView.getContext());
                flexboxLayoutManager.S(0);
                flexboxLayoutManager.T(1);
                this.this$0.customAdapterChild = new ChildAdapter(parentPosition);
                RecyclerView recyclerView = this.recycleTv;
                final CustomAdapter customAdapter = this.this$0;
                recyclerView.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.health.ecg.EcgSymptomChoiceDialog$CustomAdapter$CustomVH$bindData$1
                    @Override // androidx.recyclerview.widget.RecyclerView.s
                    public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                        Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                        super.onScrolled(recyclerView2, dx, dy);
                        int iFindLastCompletelyVisibleItemPosition = (flexboxLayoutManager.findLastCompletelyVisibleItemPosition() - flexboxLayoutManager.findFirstCompletelyVisibleItemPosition()) + 1;
                        EcgSymptomChoiceDialog.CustomAdapter.ChildAdapter childAdapter = customAdapter.customAdapterChild;
                        Intrinsics.checkNotNull(childAdapter);
                        if (iFindLastCompletelyVisibleItemPosition < childAdapter.getCount()) {
                            recyclerView2.setOverScrollMode(0);
                        } else {
                            recyclerView2.setOverScrollMode(2);
                        }
                    }
                });
                this.recycleTv.setLayoutManager(flexboxLayoutManager);
                this.recycleTv.setAdapter(this.this$0.customAdapterChild);
                List list = this.this$0.mRecommendationLabelModel;
                if ((list != null ? (DialogLabelModel) list.get(parentPosition) : null) != null && this.this$0.titleItems != null) {
                    TextView textView = this.titleTv;
                    List list2 = this.this$0.titleItems;
                    Intrinsics.checkNotNull(list2);
                    textView.setText((CharSequence) list2.get(parentPosition));
                    List<Integer> list3 = this.this$0.selectedPositionList;
                    if (parentPosition == 1) {
                        list3 = this.this$0.labelSituationList;
                    }
                    if (parentPosition != 2) {
                        ChildAdapter childAdapter = this.this$0.customAdapterChild;
                        Intrinsics.checkNotNull(childAdapter);
                        List list4 = this.this$0.mRecommendationLabelModel;
                        dialogLabelModel = list4 != null ? (DialogLabelModel) list4.get(parentPosition) : null;
                        Intrinsics.checkNotNull(dialogLabelModel);
                        childAdapter.refreshRecommendationLabelLayout(dialogLabelModel, list3, true);
                    } else {
                        ChildAdapter childAdapter2 = this.this$0.customAdapterChild;
                        Intrinsics.checkNotNull(childAdapter2);
                        List list5 = this.this$0.mRecommendationLabelModel;
                        dialogLabelModel = list5 != null ? (DialogLabelModel) list5.get(parentPosition) : null;
                        Intrinsics.checkNotNull(dialogLabelModel);
                        childAdapter2.refreshRecommendationLabelLayout(dialogLabelModel, list3, false);
                    }
                }
                ChildAdapter childAdapter3 = this.this$0.customAdapterChild;
                Intrinsics.checkNotNull(childAdapter3);
                final CustomAdapter customAdapter2 = this.this$0;
                childAdapter3.setOnItemClickListener(new OnItemClickListener() { // from class: com.xiaomi.fitness.health.ecg.EcgSymptomChoiceDialog$CustomAdapter$CustomVH$bindData$2
                    @Override // com.xiaomi.fitness.health.ecg.EcgSymptomChoiceDialog.CustomAdapter.OnItemClickListener
                    public void onItemClick(View view, String positionChar, int parentIndex, int position) {
                        Intrinsics.checkNotNullParameter(positionChar, "positionChar");
                        if (parentIndex == 2) {
                            customAdapter2.labelTimeString = positionChar;
                            customAdapter2.labelTimePosition = position;
                            customAdapter2.updateRecommendationLabelModel(positionChar);
                            EcgSymptomChoiceDialog.CustomAdapter.ChildAdapter childAdapter4 = customAdapter2.customAdapterChild;
                            Intrinsics.checkNotNull(childAdapter4);
                            List list6 = customAdapter2.mRecommendationLabelModel;
                            DialogLabelModel dialogLabelModel2 = list6 != null ? (DialogLabelModel) list6.get(parentIndex) : null;
                            Intrinsics.checkNotNull(dialogLabelModel2);
                            childAdapter4.refreshRecommendationLabelLayout(dialogLabelModel2);
                        }
                    }
                });
            }

            @NotNull
            public final RecyclerView getRecycleTv() {
                return this.recycleTv;
            }

            @NotNull
            public final TextView getTitleTv() {
                return this.titleTv;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSymptomChoiceDialog$CustomAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "positionChar", "", "parentIndex", "", "position", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface OnItemClickListener {
            void onItemClick(@Nullable View view, @NotNull String positionChar, int parentIndex, int position);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateRecommendationLabelModel(String position) {
            DialogLabelModel dialogLabelModel;
            ChildAdapter childAdapter = this.customAdapterChild;
            if (childAdapter == null || !childAdapter.isPositionAlreadySelected(position)) {
                ChildAdapter childAdapter2 = this.customAdapterChild;
                if (childAdapter2 != null) {
                    childAdapter2.setSignalSelectedPosition(position);
                }
            } else {
                ChildAdapter childAdapter3 = this.customAdapterChild;
                if (childAdapter3 != null) {
                    childAdapter3.setSignalSelectedPosition(null);
                }
                this.labelTimePosition = -1;
            }
            List<DialogLabelModel> list = this.mRecommendationLabelModel;
            if (list == null || (dialogLabelModel = list.get(2)) == null) {
                return;
            }
            ChildAdapter childAdapter4 = this.customAdapterChild;
            dialogLabelModel.setDialogSelectedPosition(childAdapter4 != null ? childAdapter4.getSignalSelectedPosition() : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            List<DialogLabelModel> list = this.mRecommendationLabelModel;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            return position;
        }

        @NotNull
        public final List<Integer> getLabelListValue() {
            return this.selectedPositionList;
        }

        @NotNull
        public final List<Integer> getLabelSituationValue() {
            return this.labelSituationList;
        }

        /* JADX INFO: renamed from: getLabelTimeString, reason: from getter */
        public final int getLabelTimePosition() {
            return this.labelTimePosition;
        }

        public final void refreshRecommendationLabelLayout(@NotNull List<DialogLabelModel> recommendationLabelModel, @NotNull List<String> EcgDialogFragmentTitle, @NotNull List<Integer> labelListBackString, @NotNull List<Integer> labelSituationBackString, int labelTimeBackPosition) {
            Intrinsics.checkNotNullParameter(recommendationLabelModel, "recommendationLabelModel");
            Intrinsics.checkNotNullParameter(EcgDialogFragmentTitle, "EcgDialogFragmentTitle");
            Intrinsics.checkNotNullParameter(labelListBackString, "labelListBackString");
            Intrinsics.checkNotNullParameter(labelSituationBackString, "labelSituationBackString");
            this.titleItems = EcgDialogFragmentTitle;
            this.mRecommendationLabelModel = recommendationLabelModel;
            this.selectedPositionList = labelListBackString;
            this.labelSituationList = labelSituationBackString;
            this.labelTimePosition = labelTimeBackPosition;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull CustomVH holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bindData(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public CustomVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.k8, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new CustomVH(this, viewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(EcgSymptomChoiceDialog this$0, c alertDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
        CustomAdapter customAdapter = this$0.mAdapter;
        Intrinsics.checkNotNull(customAdapter);
        this$0.labelListBackString = customAdapter.getLabelListValue();
        CustomAdapter customAdapter2 = this$0.mAdapter;
        Intrinsics.checkNotNull(customAdapter2);
        this$0.labelSituationBackString = customAdapter2.getLabelSituationValue();
        CustomAdapter customAdapter3 = this$0.mAdapter;
        Intrinsics.checkNotNull(customAdapter3);
        this$0.labelTimeBackPosition = customAdapter3.getLabelTimePosition();
        if (!this$0.labelListBackString.isEmpty() || (!(!this$0.labelSituationBackString.isEmpty()) && this$0.labelTimeBackPosition == -1)) {
            Bundle bundle = new Bundle();
            CustomAdapter customAdapter4 = this$0.mAdapter;
            if (customAdapter4 != null) {
                Intrinsics.checkNotNull(customAdapter4);
                this$0.labelListBackString = customAdapter4.getLabelListValue();
                CustomAdapter customAdapter5 = this$0.mAdapter;
                Intrinsics.checkNotNull(customAdapter5);
                this$0.labelSituationBackString = customAdapter5.getLabelSituationValue();
                CustomAdapter customAdapter6 = this$0.mAdapter;
                Intrinsics.checkNotNull(customAdapter6);
                this$0.labelTimeBackPosition = customAdapter6.getLabelTimePosition();
            }
            bundle.putIntegerArrayList(KEY_SELECTED_LABEL, ListExtKt.toArrayList(this$0.labelListBackString));
            bundle.putIntegerArrayList(KEY_SELECTED_LABEL_SITUATION, ListExtKt.toArrayList(this$0.labelSituationBackString));
            bundle.putInt(KEY_SELECTED_LABEL_TIME, this$0.labelTimeBackPosition);
            Logger.i(TAG, "labelListBackString" + this$0.labelListBackString + ", labelSituationBackString" + this$0.labelSituationBackString + ", labelTimeBackPosition" + this$0.labelTimeBackPosition);
            this$0.setResultData(-1, bundle);
            alertDialog.dismiss();
        } else {
            ToastUtil.showShortToast(this$0.getString(c0j.Fa));
        }
        Logger.i(TAG, "labelListBackString" + this$0.labelListBackString);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        super.initCustomView(rootView);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(eri.Nd);
        String[] stringArray = ApplicationExtKt.getApplication().getResources().getStringArray(ohi.i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.dialogLabelModel = new DialogLabelModel(ArraysKt___ArraysKt.toList(stringArray), null);
        String[] stringArray2 = ApplicationExtKt.getApplication().getResources().getStringArray(ohi.h);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        this.dialogLabelModelSituation = new DialogLabelModel(ArraysKt___ArraysKt.toList(stringArray2), null);
        String[] stringArray3 = ApplicationExtKt.getApplication().getResources().getStringArray(ohi.j);
        Intrinsics.checkNotNullExpressionValue(stringArray3, "getStringArray(...)");
        this.dialogLabelModelTime = new DialogLabelModel(ArraysKt___ArraysKt.toList(stringArray3), null);
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{ApplicationExtKt.getApplication().getResources().getString(c0j.Ea), ApplicationExtKt.getApplication().getResources().getString(c0j.ta), ApplicationExtKt.getApplication().getResources().getString(c0j.sa)});
        int i = this.labelTimeSelectPosition;
        DialogLabelModel dialogLabelModel = this.dialogLabelModelTime;
        Intrinsics.checkNotNull(dialogLabelModel);
        if (i < dialogLabelModel.getDialogLabels().size() && this.labelTimeSelectPosition >= 0) {
            DialogLabelModel dialogLabelModel2 = this.dialogLabelModelTime;
            Intrinsics.checkNotNull(dialogLabelModel2);
            DialogLabelModel dialogLabelModel3 = this.dialogLabelModelTime;
            Intrinsics.checkNotNull(dialogLabelModel3);
            dialogLabelModel2.setDialogSelectedPosition(dialogLabelModel3.getDialogLabels().get(this.labelTimeSelectPosition));
        }
        this.ecgDialogFragmentList = CollectionsKt__CollectionsKt.listOf((Object[]) new DialogLabelModel[]{this.dialogLabelModel, this.dialogLabelModelSituation, this.dialogLabelModelTime});
        if (this.mAdapter == null) {
            this.mAdapter = new CustomAdapter();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        this.mLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.mAdapter);
        Logger.i("labelListBackString" + this.labelListBackString, new Object[0]);
        CustomAdapter customAdapter = this.mAdapter;
        Intrinsics.checkNotNull(customAdapter);
        List<DialogLabelModel> list = this.ecgDialogFragmentList;
        Intrinsics.checkNotNull(list);
        customAdapter.refreshRecommendationLabelLayout(list, listListOf, this.labelListSelectString, this.labelSituationSelectString, this.labelTimeSelectPosition);
        recyclerView.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.health.ecg.EcgSymptomChoiceDialog.initCustomView.1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                LinearLayoutManager linearLayoutManager2 = EcgSymptomChoiceDialog.this.mLayoutManager;
                Intrinsics.checkNotNull(linearLayoutManager2);
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                LinearLayoutManager linearLayoutManager3 = EcgSymptomChoiceDialog.this.mLayoutManager;
                Intrinsics.checkNotNull(linearLayoutManager3);
                int iFindFirstCompletelyVisibleItemPosition = (iFindLastCompletelyVisibleItemPosition - linearLayoutManager3.findFirstCompletelyVisibleItemPosition()) + 1;
                CustomAdapter customAdapter2 = EcgSymptomChoiceDialog.this.mAdapter;
                Intrinsics.checkNotNull(customAdapter2);
                if (iFindFirstCompletelyVisibleItemPosition < customAdapter2.getCount()) {
                    recyclerView2.setOverScrollMode(0);
                } else {
                    recyclerView2.setOverScrollMode(2);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(jui.m8, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
        final c cVar = (c) dialog;
        Button buttonM = cVar.m(-1);
        Intrinsics.checkNotNullExpressionValue(buttonM, "getButton(...)");
        buttonM.setOnClickListener(new View.OnClickListener() { // from class: kc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgSymptomChoiceDialog.onResume$lambda$0(this.f23709a, cVar, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        FrameLayout frameLayout;
        super.onShow();
        Dialog dialog = getDialog();
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.custom)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        new ViewGroup.MarginLayoutParams(layoutParams).setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(layoutParams);
    }

    public final void setSituationList(@NotNull List<Integer> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelSituationSelectString = CollectionsKt___CollectionsKt.toMutableList((Collection) value);
    }

    public final void setSymptomList(@NotNull List<Integer> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelListSelectString = CollectionsKt___CollectionsKt.toMutableList((Collection) value);
    }

    public final void setTimePosition(int value) {
        this.labelTimeSelectPosition = value;
    }
}
