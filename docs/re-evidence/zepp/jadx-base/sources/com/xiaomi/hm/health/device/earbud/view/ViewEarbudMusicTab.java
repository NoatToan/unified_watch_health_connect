package com.xiaomi.hm.health.device.earbud.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.earbud.view.ViewEarbudMusicTab;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR*\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R?\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/view/ViewEarbudMusicTab;", "Landroid/widget/RelativeLayout;", "", "f", "e", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "mArrowImg", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "mMineTab", "c", "mCloudTab", "", "value", GoogleApiAvailabilityLight.a, "Z", "isArrowUp", "()Z", "setArrowUp", "(Z)V", "isTabMine", "setTabMine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isMine", "Lkotlin/jvm/functions/Function1;", "getOnTabSelect", "()Lkotlin/jvm/functions/Function1;", "setOnTabSelect", "(Lkotlin/jvm/functions/Function1;)V", "onTabSelect", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ViewEarbudMusicTab extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageView mArrowImg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView mMineTab;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView mCloudTab;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isArrowUp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isTabMine;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> onTabSelect;

    @JvmOverloads
    public ViewEarbudMusicTab(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ViewEarbudMusicTab(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public ViewEarbudMusicTab(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTabMine = true;
        View.inflate(context, R.layout.view_earbud_music_tab, this);
        this.mArrowImg = (ImageView) findViewById(R.id.arrow_view);
        TextView textView = (TextView) findViewById(R.id.music_tab_my);
        this.mMineTab = textView;
        TextView textView2 = (TextView) findViewById(R.id.music_tab_list);
        this.mCloudTab = textView2;
        textView.setOnClickListener(new View.OnClickListener() { // from class: bb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewEarbudMusicTab.c(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: cb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewEarbudMusicTab.d(this.a, view);
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewEarbudMusicTab);
        setArrowUp(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewEarbudMusicTab_isArrowUp, false));
        setTabMine(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewEarbudMusicTab_isTabMine, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ViewEarbudMusicTab viewEarbudMusicTab, View view) {
        viewEarbudMusicTab.setTabMine(true);
        Function1<Boolean, Unit> onTabSelect = viewEarbudMusicTab.getOnTabSelect();
        if (onTabSelect == null) {
            return;
        }
        onTabSelect.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ViewEarbudMusicTab viewEarbudMusicTab, View view) {
        viewEarbudMusicTab.setTabMine(false);
        Function1<Boolean, Unit> onTabSelect = viewEarbudMusicTab.getOnTabSelect();
        if (onTabSelect == null) {
            return;
        }
        onTabSelect.invoke(Boolean.FALSE);
    }

    private final void e() {
        this.mArrowImg.setImageResource(this.isArrowUp ? R.drawable.icon_earbud_pull_up : R.drawable.icon_earbud_pull_down);
    }

    private final void f() {
        if (this.isTabMine) {
            this.mMineTab.setTextSize(2, 17.0f);
            this.mMineTab.setTextColor(Color.parseColor("#666666"));
            this.mCloudTab.setTextSize(2, 15.0f);
            this.mCloudTab.setTextColor(Color.parseColor("#4d000000"));
            return;
        }
        this.mMineTab.setTextSize(2, 15.0f);
        this.mMineTab.setTextColor(Color.parseColor("#4d000000"));
        this.mCloudTab.setTextSize(2, 17.0f);
        this.mCloudTab.setTextColor(Color.parseColor("#666666"));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnTabSelect() {
        return this.onTabSelect;
    }

    /* JADX INFO: renamed from: isArrowUp, reason: from getter */
    public final boolean getIsArrowUp() {
        return this.isArrowUp;
    }

    /* JADX INFO: renamed from: isTabMine, reason: from getter */
    public final boolean getIsTabMine() {
        return this.isTabMine;
    }

    public final void setArrowUp(boolean z) {
        if (this.isArrowUp != z) {
            this.isArrowUp = z;
            e();
        }
    }

    public final void setOnTabSelect(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onTabSelect = function1;
    }

    public final void setTabMine(boolean z) {
        if (this.isTabMine != z) {
            this.isTabMine = z;
            f();
        }
    }

    public /* synthetic */ ViewEarbudMusicTab(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
