package com.xiaomi.fitness.trail.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.widget.TimeUnitPickerDialog;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.bsi;
import defpackage.j1j;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004<=>?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u000fH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0006J\u0010\u0010,\u001a\u00020\u00172\b\b\u0001\u0010-\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020\u000fJ\u000e\u0010/\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000fJ\u0014\u00100\u001a\u00020\u00172\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\b\u00102\u001a\u00020\u000fH\u0002J\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u000fJ\u000e\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0006J\u000e\u00107\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000fJ\u000e\u00108\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000fJ\u000e\u00109\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000fJ\u000e\u0010:\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020;R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "KEY_SELECTED_VALUE", "", "getKEY_SELECTED_VALUE", "()Ljava/lang/String;", "STATE_SELECT_IDX", "numberPicker", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "goDetailLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mDeferredPickValue", "", "mInitOver", "", "mHintText", "mFocusDescriptionRes", "mHintTextPluralsRes", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "initCustomView", "rootView", "Landroid/view/View;", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onDialogDismiss", "cause", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "getPickerDialogParam", "Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;", FitnessRecordKey.updateValue, "value", "initPickerView", "data", "", "setPickerHintText", "hint", "setPickerHintTextPluralsRes", "hintTextPluralsRes", "getValue", "setValue", "setGoDetailListener", "clickListener", "getCurrentIndex", "setFocusDescriptionRes", "focusDescriptionRes", "setUnit", "string", "setMinValue", "setMaxValue", "setDefaultValue", "setAddMoreListener", "Landroid/view/View$OnClickListener;", "Adapter", "TimeUnitPickerDialogParams", "Builder", "TimeUnitData", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeUnitPickerDialog extends CommonDialog<DialogParams> {

    @Nullable
    private ConstraintLayout goDetailLayout;

    @Nullable
    private Function0<Unit> listener;
    private int mFocusDescriptionRes;

    @Nullable
    private String mHintText;
    private int mHintTextPluralsRes;
    private boolean mInitOver;

    @Nullable
    private NumberPickerView numberPicker;

    @NotNull
    private final String KEY_SELECTED_VALUE = PickerDialog.KEY_SELECTED_VALUE;

    @NotNull
    private final String STATE_SELECT_IDX = "sel_idx";
    private int mDeferredPickValue = -1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Adapter;", "", "getCount", "", "getValue", "index", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Adapter {
        int getCount();

        int getValue(int index);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0013\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;", "Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog;", "getThis", "()Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog;", "Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Adapter;", "adapter", "setAdapter", "(Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Adapter;)Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$Builder;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;)V", "", "name", "(Ljava/lang/String;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, TimeUnitPickerDialogParams, TimeUnitPickerDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull TimeUnitPickerDialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @NotNull
        public final Builder setAdapter(@NotNull Adapter adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Objects.requireNonNull(adapter, "adapter can not be null");
            int count = adapter.getCount();
            int[] iArr = new int[count];
            for (int i = 0; i < count; i++) {
                iArr[i] = adapter.getValue(i);
            }
            requireDialogParams().setPickerData(iArr);
            return this;
        }

        public Builder(@Nullable String str) {
            this(new TimeUnitPickerDialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public TimeUnitPickerDialog internalCreate() {
            return new TimeUnitPickerDialog();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitData;", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "default", "unit", "", "<init>", "(IIILjava/lang/String;)V", "getStart", "()I", "getEnd", "getDefault", "getUnit", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeUnitData {
        private final int default;
        private final int end;
        private final int start;

        @NotNull
        private final String unit;

        public TimeUnitData(int i, int i2, int i3, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.start = i;
            this.end = i2;
            this.default = i3;
            this.unit = unit;
        }

        public static /* synthetic */ TimeUnitData copy$default(TimeUnitData timeUnitData, int i, int i2, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = timeUnitData.start;
            }
            if ((i4 & 2) != 0) {
                i2 = timeUnitData.end;
            }
            if ((i4 & 4) != 0) {
                i3 = timeUnitData.default;
            }
            if ((i4 & 8) != 0) {
                str = timeUnitData.unit;
            }
            return timeUnitData.copy(i, i2, i3, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDefault() {
            return this.default;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        public final TimeUnitData copy(int start, int end, int i, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new TimeUnitData(start, end, i, unit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeUnitData)) {
                return false;
            }
            TimeUnitData timeUnitData = (TimeUnitData) other;
            return this.start == timeUnitData.start && this.end == timeUnitData.end && this.default == timeUnitData.default && Intrinsics.areEqual(this.unit, timeUnitData.unit);
        }

        public final int getDefault() {
            return this.default;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Integer.hashCode(this.default)) * 31) + this.unit.hashCode();
        }

        @NotNull
        public String toString() {
            return "TimeUnitData(start=" + this.start + ", end=" + this.end + ", default=" + this.default + ", unit=" + this.unit + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "name", "", "<init>", "(Ljava/lang/String;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "mData", "", "data", "pickerData", "getPickerData", "()[I", "setPickerData", "([I)V", "writeToParcel", "", "dest", "flags", "", "describeContents", "CREATOR", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeUnitPickerDialogParams extends DialogParams {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int[] mData;

        /* JADX INFO: renamed from: com.xiaomi.fitness.trail.widget.TimeUnitPickerDialog$TimeUnitPickerDialogParams$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/trail/widget/TimeUnitPickerDialog$TimeUnitPickerDialogParams;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<TimeUnitPickerDialogParams> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public TimeUnitPickerDialogParams createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeUnitPickerDialogParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public TimeUnitPickerDialogParams[] newArray(int size) {
                return new TimeUnitPickerDialogParams[size];
            }
        }

        public TimeUnitPickerDialogParams(@Nullable String str) {
            super(str);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final int[] getPickerData() {
            int[] iArr = this.mData;
            if (iArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mData");
                iArr = null;
            }
            Objects.requireNonNull(iArr);
            Intrinsics.checkNotNullExpressionValue(iArr, "requireNonNull(...)");
            return iArr;
        }

        public final void setPickerData(@NotNull int[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Objects.requireNonNull(data);
            this.mData = data;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, flags);
            int[] iArr = this.mData;
            int[] iArr2 = null;
            if (iArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mData");
                iArr = null;
            }
            dest.writeInt(iArr.length);
            int[] iArr3 = this.mData;
            if (iArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mData");
            } else {
                iArr2 = iArr3;
            }
            dest.writeIntArray(iArr2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeUnitPickerDialogParams(@NotNull Parcel in) {
            super(in);
            Intrinsics.checkNotNullParameter(in, "in");
            int[] iArr = new int[in.readInt()];
            this.mData = iArr;
            in.readIntArray(iArr);
        }
    }

    private final int getCurrentIndex() {
        NumberPickerView numberPickerView = this.numberPicker;
        if (numberPickerView == null) {
            return 0;
        }
        Intrinsics.checkNotNull(numberPickerView);
        return numberPickerView.getPickedIndexRelativeToRaw();
    }

    private final TimeUnitPickerDialogParams getPickerDialogParam() {
        DialogParams dialogParamsRequireDialogParams = requireDialogParams();
        Intrinsics.checkNotNullExpressionValue(dialogParamsRequireDialogParams, "requireDialogParams(...)");
        if (dialogParamsRequireDialogParams instanceof TimeUnitPickerDialogParams) {
            return (TimeUnitPickerDialogParams) dialogParamsRequireDialogParams;
        }
        throw new IllegalStateException("picker dialog params not set");
    }

    private final void initPickerView(int[] data) {
        Objects.requireNonNull(data, "data can't be null,setData() first");
        int length = data.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(data[i]);
        }
        NumberPickerView numberPickerView = this.numberPicker;
        if (numberPickerView != null) {
            Intrinsics.checkNotNull(numberPickerView);
            numberPickerView.setDisplayedValues(strArr);
            NumberPickerView numberPickerView2 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView2);
            numberPickerView2.setMinValue(0);
            NumberPickerView numberPickerView3 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView3);
            numberPickerView3.setMaxValue(length - 1);
            if (this.mHintTextPluralsRes != 0) {
                String string = requireContext().getResources().getQuantityText(this.mHintTextPluralsRes, getValue()).toString();
                NumberPickerView numberPickerView4 = this.numberPicker;
                Intrinsics.checkNotNull(numberPickerView4);
                numberPickerView4.setHintText(string);
            } else if (!TextUtils.isEmpty(this.mHintText)) {
                NumberPickerView numberPickerView5 = this.numberPicker;
                Intrinsics.checkNotNull(numberPickerView5);
                numberPickerView5.setHintText(this.mHintText);
            }
            NumberPickerView.d dVar = new NumberPickerView.d() { // from class: bfp
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
                public final void onValueChange(NumberPickerView numberPickerView6, int i2, int i3) {
                    TimeUnitPickerDialog.initPickerView$lambda$0(this.f4158a, numberPickerView6, i2, i3);
                }
            };
            NumberPickerView numberPickerView6 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView6);
            numberPickerView6.setOnValueChangedListener(dVar);
        }
        ConstraintLayout constraintLayout = this.goDetailLayout;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: cfp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TimeUnitPickerDialog.initPickerView$lambda$1(this.f5290a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerView$lambda$0(TimeUnitPickerDialog this$0, NumberPickerView picker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(picker, "picker");
        Context context = this$0.getContext();
        if (context != null) {
            String string = context.getString(j1j.d0, String.valueOf(this$0.getValue()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            picker.setContentDescription(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPickerView$lambda$1(TimeUnitPickerDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void updateValue(int value) {
        if (this.numberPicker == null) {
            return;
        }
        int[] pickerData = getPickerDialogParam().getPickerData();
        NumberPickerView numberPickerView = this.numberPicker;
        Intrinsics.checkNotNull(numberPickerView);
        int i = pickerData[numberPickerView.getMaxValue()];
        if (i >= value) {
            int i2 = 0;
            for (int i3 : pickerData) {
                if (i3 == value) {
                    NumberPickerView numberPickerView2 = this.numberPicker;
                    Intrinsics.checkNotNull(numberPickerView2);
                    numberPickerView2.setValue(i2);
                    break;
                }
                i2++;
            }
        } else {
            NumberPickerView numberPickerView3 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView3);
            NumberPickerView numberPickerView4 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView4);
            numberPickerView3.setValue(numberPickerView4.getMaxValue());
            value = i;
        }
        if (this.mFocusDescriptionRes != 0) {
            NumberPickerView numberPickerView5 = this.numberPicker;
            Intrinsics.checkNotNull(numberPickerView5);
            numberPickerView5.setContentDescription(getString(this.mFocusDescriptionRes, Integer.valueOf(value)));
        }
    }

    @NotNull
    public final String getKEY_SELECTED_VALUE() {
        return this.KEY_SELECTED_VALUE;
    }

    public final int getValue() {
        if (this.numberPicker == null) {
            return this.mDeferredPickValue;
        }
        int currentIndex = getCurrentIndex();
        int[] pickerData = getPickerDialogParam().getPickerData();
        return currentIndex < pickerData.length ? pickerData[currentIndex] : this.mDeferredPickValue;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        this.numberPicker = rootView != null ? (NumberPickerView) rootView.findViewById(bsi.O4) : null;
        this.goDetailLayout = rootView != null ? (ConstraintLayout) rootView.findViewById(bsi.g) : null;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        int[] pickerData = getPickerDialogParam().getPickerData();
        if (savedInstanceState != null) {
            this.mDeferredPickValue = pickerData[savedInstanceState.getInt(this.STATE_SELECT_IDX, -1)];
        }
        initPickerView(pickerData);
        int i = this.mDeferredPickValue;
        if (i != -1) {
            updateValue(i);
            this.mDeferredPickValue = -1;
        }
        this.mInitOver = true;
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int cause) {
        super.onDialogDismiss(cause);
        if (cause == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(PickerDialog.KEY_SELECTED_VALUE, getValue());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(this.STATE_SELECT_IDX, getCurrentIndex());
    }

    public final void setAddMoreListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public final void setDefaultValue(int value) {
        NumberPickerView numberPickerView = this.numberPicker;
        if (numberPickerView != null) {
            numberPickerView.setValue(value);
        }
    }

    public final void setFocusDescriptionRes(int focusDescriptionRes) {
        this.mFocusDescriptionRes = focusDescriptionRes;
    }

    public final void setGoDetailListener(@NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.listener = clickListener;
    }

    public final void setMaxValue(int value) {
        NumberPickerView numberPickerView = this.numberPicker;
        if (numberPickerView != null) {
            numberPickerView.setMaxValue(value);
        }
    }

    public final void setMinValue(int value) {
        NumberPickerView numberPickerView = this.numberPicker;
        if (numberPickerView != null) {
            numberPickerView.setMinValue(value);
        }
    }

    public final void setPickerHintText(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.mHintText = hint;
    }

    public final void setPickerHintTextPluralsRes(int hintTextPluralsRes) {
        this.mHintTextPluralsRes = hintTextPluralsRes;
    }

    public final void setUnit(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    public final void setValue(int value) {
        UIUtils.checkInMainThread();
        if (!this.mInitOver || this.numberPicker == null) {
            this.mDeferredPickValue = value;
        } else {
            updateValue(value);
        }
    }
}
