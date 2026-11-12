package com.xiaomi.hm.health.device.settings.alert;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/Type;", "", "", "a", LogUtil.I, "getName", "()I", "name", "b", "getIcon", "icon", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class Type {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int icon;

    public Type(@StringRes int i, @DrawableRes int i2) {
        this.name = i;
        this.icon = i2;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getName() {
        return this.name;
    }
}
