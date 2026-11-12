package com.xiaomi.fitness.privacy.export;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/privacy/export/IPrivacySensitive;", "", "onPrivacyAccepted", "", "onPrivacyDenied", "privacy-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPrivacySensitive {
    void onPrivacyAccepted();

    void onPrivacyDenied();
}
