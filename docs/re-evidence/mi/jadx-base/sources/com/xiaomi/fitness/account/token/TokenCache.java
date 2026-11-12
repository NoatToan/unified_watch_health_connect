package com.xiaomi.fitness.account.token;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\nJ\u000f\u0010\u000e\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\fH&R\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/account/token/TokenCache;", "T", "", PrivacyAgreeModel.TYPE_ACCEPT, "", "token", "Lcom/xiaomi/fitness/account/token/AccessToken;", "getToken", "()Ljava/lang/Object;", "setToken", "(Ljava/lang/Object;)V", "save", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "load", CervicalMucusRecord.Appearance.CLEAR, TrackConstants.LOGOUT, "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TokenCache<T> {
    boolean accept(@Nullable AccessToken token);

    void clear();

    @Nullable
    T getToken();

    @Nullable
    T load();

    void logout();

    void save(@Nullable T t);

    void setToken(@Nullable T t);
}
