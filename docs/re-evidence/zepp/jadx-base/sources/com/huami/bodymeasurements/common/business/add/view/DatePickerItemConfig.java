package com.huami.bodymeasurements.common.business.add.view;

import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.view.DatePickerDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b6\u00107R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR6\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020-\u0018\u00010,j\u0004\u0018\u0001`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemConfig;", "", "Landroidx/fragment/app/FragmentManager;", "a", "Landroidx/fragment/app/FragmentManager;", "getFm", "()Landroidx/fragment/app/FragmentManager;", "fm", "", "b", "Ljava/lang/String;", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "itemName", "Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "c", "Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "getDatePickerMode", "()Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "setDatePickerMode", "(Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;)V", "datePickerMode", GoogleApiAvailabilityLight.a, "getDatePickerTitle", "setDatePickerTitle", "datePickerTitle", "", "e", "J", "getDatePickerCurTime", "()J", "setDatePickerCurTime", "(J)V", "datePickerCurTime", "f", "getDatePickerStartTime", "setDatePickerStartTime", "datePickerStartTime", "g", "getDateFormatPattern", "setDateFormatPattern", "dateFormatPattern", "Lkotlin/Function1;", "", "Lcom/huami/bodymeasurements/common/business/add/view/DateSelected;", "h", "Lkotlin/jvm/functions/Function1;", "getDateSelected", "()Lkotlin/jvm/functions/Function1;", "setDateSelected", "(Lkotlin/jvm/functions/Function1;)V", "dateSelected", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class DatePickerItemConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager fm;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String itemName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String datePickerTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long datePickerStartTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Long, Unit> dateSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private DatePickerDialog.Mode datePickerMode = DatePickerDialog.Mode.DATE;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long datePickerCurTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String dateFormatPattern = TimeFormatUtils.PATTERN_YYY_MM_DD;

    public DatePickerItemConfig(@NotNull FragmentManager fragmentManager) {
        this.fm = fragmentManager;
    }

    @NotNull
    public final String getDateFormatPattern() {
        return this.dateFormatPattern;
    }

    public final long getDatePickerCurTime() {
        return this.datePickerCurTime;
    }

    @NotNull
    public final DatePickerDialog.Mode getDatePickerMode() {
        return this.datePickerMode;
    }

    public final long getDatePickerStartTime() {
        return this.datePickerStartTime;
    }

    @Nullable
    public final String getDatePickerTitle() {
        return this.datePickerTitle;
    }

    @Nullable
    public final Function1<Long, Unit> getDateSelected() {
        return this.dateSelected;
    }

    @NotNull
    public final FragmentManager getFm() {
        return this.fm;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    public final void setDateFormatPattern(@NotNull String str) {
        this.dateFormatPattern = str;
    }

    public final void setDatePickerCurTime(long j) {
        this.datePickerCurTime = j;
    }

    public final void setDatePickerMode(@NotNull DatePickerDialog.Mode mode) {
        this.datePickerMode = mode;
    }

    public final void setDatePickerStartTime(long j) {
        this.datePickerStartTime = j;
    }

    public final void setDatePickerTitle(@Nullable String str) {
        this.datePickerTitle = str;
    }

    public final void setDateSelected(@Nullable Function1<? super Long, Unit> function1) {
        this.dateSelected = function1;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }
}
