package com.huami.bodymeasurements.common.business.add.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.facebook.share.model.ShareStoryContent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.R;
import com.huami.bodymeasurements.common.business.add.view.DatePickerItemView;
import com.huami.bodymeasurements.common.view.DatePickerDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemConfig;", "config", "", "setConfig", GoogleApiAvailabilityLight.a, "", "pattern", "", "time", "c", "a", "Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemConfig;", "pickerItemConfig", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", ShareStoryContent.Builder.k, "common_release"}, k = 1, mv = {1, 5, 1})
public final class DatePickerItemView extends ItemView {

    @NotNull
    private static final String b = "DateItemView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private DatePickerItemConfig pickerItemConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u0014\u001a\u00020\u00002\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemView$Builder;", "", "", "itemName", "setItemName", "Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "mode", "setDatePickerMode", "title", "setDatePickerTitle", "", "time", "setDatePickerCurTime", "setDatePickerStartTime", "pattern", "setDateFormatPattern", "Lkotlin/Function1;", "", "Lcom/huami/bodymeasurements/common/business/add/view/DateSelected;", "dateSelected", "setDateSelected", "Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemView;", "create", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemConfig;", "b", "Lcom/huami/bodymeasurements/common/business/add/view/DatePickerItemConfig;", "itemConfig", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final DatePickerItemConfig itemConfig;

        public Builder(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
            this.context = context;
            this.itemConfig = new DatePickerItemConfig(fragmentManager);
        }

        @NotNull
        public final DatePickerItemView create() {
            DatePickerItemView datePickerItemView = new DatePickerItemView(this.context, (DefaultConstructorMarker) null);
            datePickerItemView.setConfig(this.itemConfig);
            return datePickerItemView;
        }

        @NotNull
        public final Builder setDateFormatPattern(@NotNull String pattern) {
            this.itemConfig.setDateFormatPattern(pattern);
            return this;
        }

        @NotNull
        public final Builder setDatePickerCurTime(long time) {
            this.itemConfig.setDatePickerCurTime(time);
            return this;
        }

        @NotNull
        public final Builder setDatePickerMode(@NotNull DatePickerDialog.Mode mode) {
            this.itemConfig.setDatePickerMode(mode);
            return this;
        }

        @NotNull
        public final Builder setDatePickerStartTime(long time) {
            this.itemConfig.setDatePickerStartTime(time);
            return this;
        }

        @NotNull
        public final Builder setDatePickerTitle(@NotNull String title) {
            this.itemConfig.setDatePickerTitle(title);
            return this;
        }

        @NotNull
        public final Builder setDateSelected(@NotNull Function1<? super Long, Unit> dateSelected) {
            this.itemConfig.setDateSelected(dateSelected);
            return this;
        }

        @NotNull
        public final Builder setItemName(@NotNull String itemName) {
            this.itemConfig.setItemName(itemName);
            return this;
        }
    }

    public DatePickerItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.bm_common_date_picker_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ DatePickerItemView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String c(String pattern, long time) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(new Date(time));
    }

    private final void d(final DatePickerItemConfig config) {
        ((TypefaceTextView) findViewById(R.id.nameTv)).setText(config.getItemName());
        ((TypefaceTextView) findViewById(R.id.dateTv)).setOnClickListener(new View.OnClickListener() { // from class: g31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerItemView.e(config, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final DatePickerItemConfig datePickerItemConfig, final DatePickerItemView datePickerItemView, View view) {
        new DatePickerDialog().showDialog(datePickerItemConfig.getFm(), datePickerItemConfig.getDatePickerCurTime(), datePickerItemConfig.getDatePickerStartTime(), datePickerItemConfig.getDatePickerMode(), datePickerItemConfig.getDatePickerTitle(), new DatePickerDialog.DateSelectListener() { // from class: h31
            @Override // com.huami.bodymeasurements.common.view.DatePickerDialog.DateSelectListener
            public final void onDateSelect(long j) {
                DatePickerItemView.f(this.a, datePickerItemConfig, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(DatePickerItemView datePickerItemView, DatePickerItemConfig datePickerItemConfig, long j) {
        ((TypefaceTextView) datePickerItemView.findViewById(R.id.dateTv)).setText(datePickerItemView.c(datePickerItemConfig.getDateFormatPattern(), j));
        Function1<Long, Unit> dateSelected = datePickerItemConfig.getDateSelected();
        if (dateSelected == null) {
            return;
        }
        dateSelected.invoke(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfig(DatePickerItemConfig config) {
        this.pickerItemConfig = config;
        Objects.requireNonNull(config);
        d(config);
    }

    @Override // com.huami.bodymeasurements.common.business.add.view.ItemView
    public void _$_clearFindViewByIdCache() {
    }

    private DatePickerItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
