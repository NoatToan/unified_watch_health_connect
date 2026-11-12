package com.xiaomi.fitness.account.token;

import android.os.Parcelable;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/account/token/AccessToken;", "Landroid/os/Parcelable;", "isLogin", "", "()Z", TrackConstants.LOGOUT, "", CervicalMucusRecord.Appearance.CLEAR, "isExpires", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccessToken extends Parcelable {
    void clear();

    boolean isExpires();

    boolean isLogin();

    void logout();
}
