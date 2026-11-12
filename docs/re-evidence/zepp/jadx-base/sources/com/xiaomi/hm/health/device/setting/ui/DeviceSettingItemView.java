package com.xiaomi.hm.health.device.setting.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceSettingItemView extends FrameLayout implements Enable, AlphaTarget {
    private ListTile a;

    public DeviceSettingItemView(@NonNull Context context) {
        this(context, null);
    }

    private void a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        FrameLayout.inflate(context, R.layout.fragment_device_setting_item, this);
        this.a = (ListTile) findViewById(R.id.item_view);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DeviceSettingItemView, 0, i);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.DeviceSettingItemView_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.DeviceSettingItemView_subtitle);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DeviceSettingItemView_showArrow, true);
        this.a.setTitle(string);
        this.a.setTips(string2);
        if (!z) {
            this.a.setTrailing((Drawable) null);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View, com.xiaomi.hm.health.device.setting.ui.AlphaTarget
    public void setAlpha(float f) {
        this.a.setAlpha(f);
    }

    public void setArrowVisible(@NonNull Boolean bool) {
    }

    @Override // android.view.View, com.xiaomi.hm.health.device.setting.ui.Enable
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
        super.setEnabled(z);
    }

    public void setName(@NonNull String str) {
        this.a.setTitle(str);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
    }

    public void setRedDotVisible(@NonNull Boolean bool) {
        this.a.setDotted(bool.booleanValue());
    }

    public void setSummary(@NotNull String str) {
        this.a.setSubtitle(str);
    }

    public void setValue(@NonNull String str) {
        this.a.setTips(str);
    }

    public void setValueVisible(@NonNull Boolean bool) {
    }

    public DeviceSettingItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeviceSettingItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public DeviceSettingItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i);
    }
}
