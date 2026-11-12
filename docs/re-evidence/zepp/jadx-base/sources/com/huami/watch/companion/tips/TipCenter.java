package com.huami.watch.companion.tips;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class TipCenter implements ITipHideListener {
    public static final String TAG_APP_UPGRADE = "app_upgrade";
    public static final String TAG_NEW_PB = "new_pb";
    public static final String TAG_NO_NET = "no_net";
    public static final String TAG_ROM_UPGRADE = "rom_upgrade";
    public static final String TAG_SYNC_DATA = "sync_data";
    public static final int TIP_TYPE_NORMAL = 0;
    public static final int TIP_TYPE_PB = 2;
    public static final int TIP_TYPE_UPGRADE = 1;
    private FrameLayout a;
    private HashMap<String, BaseTipView> b = new HashMap<>();

    private TipCenter(@NonNull FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static TipCenter create(@NonNull FrameLayout frameLayout) {
        return new TipCenter(frameLayout);
    }

    public <T> T getCacheTipView(@Nullable String str, Class<T> cls) {
        if (TextUtils.isEmpty(str) || !this.b.containsKey(str)) {
            return null;
        }
        return cls.cast(this.b.get(str));
    }

    public NewPBTipView getNewPBTip() {
        return (NewPBTipView) getTipView(2, TAG_NEW_PB, NewPBTipView.class);
    }

    public UpgradeTipView getRomUpgradeTip() {
        return (UpgradeTipView) getTipView(1, TAG_ROM_UPGRADE, UpgradeTipView.class);
    }

    public TipsView getSyncTip() {
        return (TipsView) getTipView(0, TAG_SYNC_DATA, TipsView.class);
    }

    public <T> T getTipView(int i, @Nullable String str, Class<T> cls) {
        BaseTipView newPBTipView;
        if (!TextUtils.isEmpty(str) && this.b.containsKey(str)) {
            return cls.cast(this.b.get(str));
        }
        T tCast = null;
        if (i == 0) {
            newPBTipView = new TipsView(this.a.getContext());
        } else if (i == 1) {
            newPBTipView = new UpgradeTipView(this.a.getContext());
        } else {
            newPBTipView = i == 2 ? new NewPBTipView(this.a.getContext()) : null;
        }
        if (newPBTipView != null) {
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            newPBTipView.setTag(str);
            newPBTipView.setHideListener(this);
            this.a.addView(newPBTipView);
            this.b.put(str, newPBTipView);
            tCast = cls.cast(newPBTipView);
        }
        if (tCast != null) {
            return tCast;
        }
        throw new IllegalStateException("type is not support : " + i);
    }

    @Override // com.huami.watch.companion.tips.ITipHideListener
    public void hide(String str) {
        BaseTipView baseTipView;
        if (TextUtils.isEmpty(str) || (baseTipView = this.b.get(str)) == null) {
            return;
        }
        this.a.removeView(baseTipView);
        this.b.remove(str);
    }

    public <T> T getTipView(int i, Class<T> cls) {
        return (T) getTipView(i, null, cls);
    }
}
