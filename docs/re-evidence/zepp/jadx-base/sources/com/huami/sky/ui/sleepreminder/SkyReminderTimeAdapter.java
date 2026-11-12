package com.huami.sky.ui.sleepreminder;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyItemReminderTimeBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u0000 G2\u00020\u0001:\u0001GB%\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\bE\u0010FJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;¨\u0006H"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkyReminderTimeAdapter;", "Lcom/huami/widget/wheelview/adapters/WheelViewAdapter;", "Lcom/huami/sky/ui/sleepreminder/SkySelectTimeHolder;", "holder", "", "height", "", "b", "a", "getItemsCount", "index", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getItem", "getEmptyItem", "Landroid/database/DataSetObserver;", "observer", "registerDataSetObserver", "unregisterDataSetObserver", "", "isNeedLoop", "getInitLoopBase", "getBASE_BUNDLE", "canClick", "setClickable", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "Ljava/util/List;", "wheelDataList", "Lcom/huami/widget/wheelview/WheelView;", "c", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", GoogleApiAvailabilityLight.a, LogUtil.I, "getCenterColor", "()I", "setCenterColor", "(I)V", "centerColor", "e", "getNormalColor", "setNormalColor", "normalColor", "f", "getNormalColorLight", "setNormalColorLight", "normalColorLight", "", "g", "F", "getCenterTextSize", "()F", "setCenterTextSize", "(F)V", "centerTextSize", "h", "getNormalTextSize", "setNormalTextSize", "normalTextSize", "i", "getNormalLightTextSize", "setNormalLightTextSize", "normalLightTextSize", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/huami/widget/wheelview/WheelView;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderTimeAdapter implements WheelViewAdapter {
    private static final float j = 20.0f;
    private static final float k = 18.0f;
    private static final float l = 16.0f;
    private static final int m = 50;
    private static final int n = 40;
    private static final int o = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<String> wheelDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WheelView wheelView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int centerColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int normalColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int normalColorLight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float centerTextSize = 20.0f;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float normalTextSize = k;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float normalLightTextSize = 16.0f;

    public SkyReminderTimeAdapter(@NotNull Context context, @NotNull List<String> list, @NotNull WheelView wheelView) {
        this.context = context;
        this.wheelDataList = list;
        this.wheelView = wheelView;
        a();
    }

    private final void a() {
        Context context = this.context;
        int i = R.color.s46;
        this.centerColor = ContextCompat.getColor(context, i);
        this.normalColor = ExtFuncKt.addAlpha(ContextCompat.getColor(this.context, i), 0.6d);
        this.normalColorLight = ExtFuncKt.addAlpha(ContextCompat.getColor(this.context, i), 0.4d);
    }

    private final void b(SkySelectTimeHolder holder, int height) {
        holder.getContent().getLayoutParams().height = SkyExtKt.getDp(height);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return 0;
    }

    public final int getCenterColor() {
        return this.centerColor;
    }

    public final float getCenterTextSize() {
        return this.centerTextSize;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @Nullable
    public View getEmptyItem(@Nullable View convertView, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: getInitLoopBase */
    public int getMInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @NotNull
    public View getItem(int index, @Nullable View convertView, @Nullable ViewGroup parent) {
        SkySelectTimeHolder skySelectTimeHolder;
        if (convertView == null) {
            SkyItemReminderTimeBinding skyItemReminderTimeBindingInflate = SkyItemReminderTimeBinding.inflate(LayoutInflater.from(this.context), parent, false);
            AppCompatTextView root = skyItemReminderTimeBindingInflate.getRoot();
            skySelectTimeHolder = new SkySelectTimeHolder(skyItemReminderTimeBindingInflate.itemReminderTime);
            root.setTag(skySelectTimeHolder);
            convertView = root;
        } else {
            Object tag = convertView.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.sky.ui.sleepreminder.SkySelectTimeHolder");
            skySelectTimeHolder = (SkySelectTimeHolder) tag;
        }
        int realCurrentItem = this.wheelView.getRealCurrentItem();
        if (index == realCurrentItem) {
            skySelectTimeHolder.getContent().setTextColor(this.centerColor);
            skySelectTimeHolder.getContent().setTextSize(this.centerTextSize);
        } else if (index == realCurrentItem - 1 || index == realCurrentItem + 1) {
            skySelectTimeHolder.getContent().setTextColor(this.normalColor);
            skySelectTimeHolder.getContent().setTextSize(this.normalTextSize);
        } else {
            skySelectTimeHolder.getContent().setTextColor(this.normalColorLight);
            skySelectTimeHolder.getContent().setTextSize(this.normalLightTextSize);
        }
        skySelectTimeHolder.getContent().setText(this.wheelDataList.get(index));
        return convertView;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.wheelDataList.size();
    }

    public final int getNormalColor() {
        return this.normalColor;
    }

    public final int getNormalColorLight() {
        return this.normalColorLight;
    }

    public final float getNormalLightTextSize() {
        return this.normalLightTextSize;
    }

    public final float getNormalTextSize() {
        return this.normalTextSize;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: isNeedLoop */
    public boolean getMNeedLoop() {
        return false;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(@Nullable DataSetObserver observer) {
    }

    public final void setCenterColor(int i) {
        this.centerColor = i;
    }

    public final void setCenterTextSize(float f) {
        this.centerTextSize = f;
    }

    public final void setClickable(boolean canClick) {
        this.wheelView.setEnabled(canClick);
        if (canClick) {
            a();
            return;
        }
        Context context = this.context;
        int i = R.color.s46;
        this.centerColor = ExtFuncKt.addAlpha(ContextCompat.getColor(context, i), 0.3d);
        this.normalColor = ExtFuncKt.addAlpha(ContextCompat.getColor(this.context, i), 0.3d);
        this.normalColorLight = ExtFuncKt.addAlpha(ContextCompat.getColor(this.context, i), 0.3d);
    }

    public final void setNormalColor(int i) {
        this.normalColor = i;
    }

    public final void setNormalColorLight(int i) {
        this.normalColorLight = i;
    }

    public final void setNormalLightTextSize(float f) {
        this.normalLightTextSize = f;
    }

    public final void setNormalTextSize(float f) {
        this.normalTextSize = f;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(@Nullable DataSetObserver observer) {
    }
}
