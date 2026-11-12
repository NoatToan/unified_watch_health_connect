package com.huami.bodymeasurements.common.business.add.view;

import android.content.Context;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.share.model.ShareStoryContent;
import com.huami.bodymeasurements.common.R;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "Lcom/huami/bodymeasurements/common/business/add/view/EditItemConfig;", "config", "", "setConfig", "a", "", "saveEnable", "Lcom/huami/bodymeasurements/common/business/add/view/EditItemConfig;", "editItemConfig", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", ShareStoryContent.Builder.k, "common_release"}, k = 1, mv = {1, 5, 1})
public final class EditItemView extends ItemView {

    @NotNull
    private static final String b = "EditItemView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private EditItemConfig editItemConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\u00002\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fJ\u001e\u0010\u0012\u001a\u00020\u00002\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\nj\u0002`\u0010J\u0006\u0010\u0014\u001a\u00020\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/EditItemView$Builder;", "", "", "itemName", "setItemName", "itemUnit", "setItemUnit", "", "digits", "setDigits", "Lkotlin/Function1;", "", "Lcom/huami/bodymeasurements/common/business/add/view/CheckContentValid;", "checkValid", "setCheckContentValid", "", "Lcom/huami/bodymeasurements/common/business/add/view/InputFinished;", "inputFinished", "setInputFinished", "Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "create", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bodymeasurements/common/business/add/view/EditItemConfig;", "b", "Lcom/huami/bodymeasurements/common/business/add/view/EditItemConfig;", "itemConfig", "<init>", "(Landroid/content/Context;)V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final EditItemConfig itemConfig = new EditItemConfig();

        public Builder(@NotNull Context context) {
            this.context = context;
        }

        @NotNull
        public final EditItemView create() {
            EditItemView editItemView = new EditItemView(this.context, (DefaultConstructorMarker) null);
            editItemView.setConfig(this.itemConfig);
            return editItemView;
        }

        @NotNull
        public final Builder setCheckContentValid(@NotNull Function1<? super String, Boolean> checkValid) {
            this.itemConfig.setCheckContentValid(checkValid);
            return this;
        }

        @NotNull
        public final Builder setDigits(int digits) {
            this.itemConfig.setDigits(digits);
            return this;
        }

        @NotNull
        public final Builder setInputFinished(@NotNull Function1<? super String, Unit> inputFinished) {
            this.itemConfig.setInputFinished(inputFinished);
            return this;
        }

        @NotNull
        public final Builder setItemName(@NotNull String itemName) {
            this.itemConfig.setItemName(itemName);
            return this;
        }

        @NotNull
        public final Builder setItemUnit(@NotNull String itemUnit) {
            this.itemConfig.setItemUnit(itemUnit);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ EditItemConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EditItemConfig editItemConfig) {
            super(1);
            this.a = editItemConfig;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            Function1<String, Unit> inputFinished = this.a.getInputFinished();
            if (inputFinished == null) {
                return;
            }
            inputFinished.invoke(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "text", "", "selection", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<String, Integer, Unit> {
        public b() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
            EditItemView editItemView = EditItemView.this;
            int i2 = R.id.editText;
            ((EditText) editItemView.findViewById(i2)).setText(str);
            ((EditText) EditItemView.this.findViewById(i2)).setSelection(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public EditItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.bm_common_edit_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ EditItemView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void a(EditItemConfig config) {
        ((TypefaceTextView) findViewById(R.id.nameTv)).setText(config.getItemName());
        int i = R.id.editText;
        ((EditText) findViewById(i)).setHint(config.getItemUnit());
        if (config.getDigits() == 0) {
            ((EditText) findViewById(i)).setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        }
        ((EditText) findViewById(i)).addTextChangedListener(new DigitsTextWatcher(new a(config), new b(), config.getDigits()));
        ((ImageView) findViewById(R.id.moreIv)).setImageResource(ViewExKt.isRtl() ? R.drawable.bm_common_icon_left_arrow_dark : R.drawable.bm_common_icon_right_arrow_dark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfig(EditItemConfig config) {
        this.editItemConfig = config;
        Objects.requireNonNull(config);
        a(config);
    }

    @Override // com.huami.bodymeasurements.common.business.add.view.ItemView
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.common.business.add.view.ItemView, com.huami.bodymeasurements.common.business.add.ItemViewApi
    public boolean saveEnable() {
        Boolean boolInvoke;
        String string = ((EditText) findViewById(R.id.editText)).getText().toString();
        EditItemConfig editItemConfig = this.editItemConfig;
        Objects.requireNonNull(editItemConfig);
        Function1<String, Boolean> checkContentValid = editItemConfig.getCheckContentValid();
        if (checkContentValid == null || (boolInvoke = checkContentValid.invoke(string)) == null) {
            return false;
        }
        return boolInvoke.booleanValue();
    }

    private EditItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
