package com.huami.bodymeasurements.common.business.add.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.share.model.ShareStoryContent;
import com.huami.bodymeasurements.common.R;
import com.huami.bodymeasurements.common.business.add.view.NormalItemView;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemConfig;", "config", "", "setConfig", "b", "", "itemValue", "setItemValue", "", "saveEnable", "a", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemConfig;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", ShareStoryContent.Builder.k, "common_release"}, k = 1, mv = {1, 5, 1})
public final class NormalItemView extends ItemView {

    @NotNull
    private static final String b = "EditItemView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private NormalItemConfig config;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tJ\u0018\u0010\u000f\u001a\u00020\u00002\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u0007j\u0002`\rJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView$Builder;", "", "", "itemName", "setItemName", "itemValue", "setItemValue", "Lkotlin/Function0;", "", "Lcom/huami/bodymeasurements/common/business/add/view/ValueClick;", "valueClick", "setValueClick", "", "Lcom/huami/bodymeasurements/common/business/add/view/SaveEnable;", "saveEnable", "setSaveEnable", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "create", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemConfig;", "b", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemConfig;", "itemConfig", "<init>", "(Landroid/content/Context;)V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final NormalItemConfig itemConfig = new NormalItemConfig();

        public Builder(@NotNull Context context) {
            this.context = context;
        }

        @NotNull
        public final NormalItemView create() {
            NormalItemView normalItemView = new NormalItemView(this.context, (DefaultConstructorMarker) null);
            normalItemView.setConfig(this.itemConfig);
            return normalItemView;
        }

        @NotNull
        public final Builder setItemName(@NotNull String itemName) {
            this.itemConfig.setItemName(itemName);
            return this;
        }

        @NotNull
        public final Builder setItemValue(@NotNull String itemValue) {
            this.itemConfig.setItemValue(itemValue);
            return this;
        }

        @NotNull
        public final Builder setSaveEnable(@NotNull Function0<Boolean> saveEnable) {
            this.itemConfig.setSaveEnable(saveEnable);
            return this;
        }

        @NotNull
        public final Builder setValueClick(@NotNull Function0<Unit> valueClick) {
            this.itemConfig.setValueClick(valueClick);
            return this;
        }
    }

    public NormalItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.bm_common_normal_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ NormalItemView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void b(final NormalItemConfig config) {
        ((TypefaceTextView) findViewById(R.id.nameTv)).setText(config.getItemName());
        int i = R.id.valueTv;
        ((TypefaceTextView) findViewById(i)).setText(config.getItemValue());
        ((TypefaceTextView) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: of5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NormalItemView.c(config, view);
            }
        });
        ((ImageView) findViewById(R.id.moreIv)).setImageResource(ViewExKt.isRtl() ? R.drawable.bm_common_icon_left_arrow_dark : R.drawable.bm_common_icon_right_arrow_dark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NormalItemConfig normalItemConfig, View view) {
        Function0<Unit> valueClick = normalItemConfig.getValueClick();
        if (valueClick == null) {
            return;
        }
        valueClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfig(NormalItemConfig config) {
        this.config = config;
        Objects.requireNonNull(config);
        b(config);
    }

    @Override // com.huami.bodymeasurements.common.business.add.view.ItemView
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.common.business.add.view.ItemView, com.huami.bodymeasurements.common.business.add.ItemViewApi
    public boolean saveEnable() {
        Boolean boolInvoke;
        NormalItemConfig normalItemConfig = this.config;
        Objects.requireNonNull(normalItemConfig);
        Function0<Boolean> saveEnable = normalItemConfig.getSaveEnable();
        if (saveEnable == null || (boolInvoke = saveEnable.invoke()) == null) {
            return false;
        }
        return boolInvoke.booleanValue();
    }

    public final void setItemValue(@NotNull String itemValue) {
        ((TypefaceTextView) findViewById(R.id.valueTv)).setText(itemValue);
    }

    private NormalItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
