package com.huami.ecg.core.model.constant;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/huami/ecg/core/model/constant/EcgTagKeys;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "CATEGORY_SCENE", "CATEGORY_BODY", "CATEGORY_EMOTION", "TAG_SPORT", "TAG_SMOKING", "TAG_DRINK", "TAG_COFFEE", "TAG_POOR_SLEEP", "TAG_COLD_FEVER", "TAG_CHEST_PAIN", "TAG_CHEST_TIGHTNESS", "TAG_FLUSTERED", "TAG_FEEL_SUFFOCATED", "TAG_DIZZINESS", "TAG_HEADACHE", "TAG_FATIGUTE", "TAG_OTHER", "TAG_ANXIETY", "TAG_ANGER", "TAG_FINE", "TAG_CALM", "TAG_CHEERFUL", "TAG_DEPRESSED", "TAG_EXCITEMENT", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public enum EcgTagKeys {
    CATEGORY_SCENE("scene", -1),
    CATEGORY_BODY("body", -1),
    CATEGORY_EMOTION("emotion", -1),
    TAG_SPORT("ecg_sport", 16),
    TAG_SMOKING("ecg_smoking", 17),
    TAG_DRINK("ecg_drink", 18),
    TAG_COFFEE("ecg_coffee", 19),
    TAG_POOR_SLEEP("ecg_poor_sleep", 1),
    TAG_COLD_FEVER("ecg_cold_fever", 2),
    TAG_CHEST_PAIN("ecg_chest_pain", -1),
    TAG_CHEST_TIGHTNESS("ecg_chest_tightness", 3),
    TAG_FLUSTERED("ecg_flustered", 4),
    TAG_FEEL_SUFFOCATED("ecg_feel_suffocated", 5),
    TAG_DIZZINESS("ecg_dizziness", 6),
    TAG_HEADACHE("ecg_headache", 7),
    TAG_FATIGUTE("ecg_fatigute", 0),
    TAG_OTHER("ecg_other_discomfort", 8),
    TAG_ANXIETY("ecg_anxiety", 14),
    TAG_ANGER("ecg_anger", 15),
    TAG_FINE("ecg_fine", 9),
    TAG_CALM("ecg_calm", 11),
    TAG_CHEERFUL("ecg_cheerful", 10),
    TAG_DEPRESSED("ecg_depressed", 12),
    TAG_EXCITEMENT("ecg_excitement", 13);


    @NotNull
    private final String key;
    private final int value;

    EcgTagKeys(String str, int i) {
        this.key = str;
        this.value = i;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }
}
