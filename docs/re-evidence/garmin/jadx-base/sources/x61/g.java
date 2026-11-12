package x61;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx61/g;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f189239b;

    public g(String str) {
        str.getClass();
        this.f189238a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f189239b = linkedHashMap;
        Integer numValueOf = Integer.valueOf(R.string.training_status_feedback_phrase_no_status_1);
        linkedHashMap.put("NO_STATUS_1", numValueOf);
        linkedHashMap.put("NO_STATUS_2", numValueOf);
        linkedHashMap.put("DETRAINING", Integer.valueOf(R.string.training_status_feedback_phrase_detraining));
        linkedHashMap.put("RECOVERY_1", Integer.valueOf(R.string.training_status_feedback_phrase_recovery_1_v2));
        linkedHashMap.put("RECOVERY_2", Integer.valueOf(R.string.training_status_feedback_phrase_recovery_2));
        linkedHashMap.put("MAINTAINING_1", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_1));
        linkedHashMap.put("MAINTAINING_2", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_2));
        linkedHashMap.put("MAINTAINING_3", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_3));
        linkedHashMap.put("MAINTAINING_4", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_4));
        linkedHashMap.put("MAINTAINING_5", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_5));
        linkedHashMap.put("MAINTAINING_6", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_6));
        linkedHashMap.put("MAINTAINING_7", Integer.valueOf(R.string.training_status_feedback_phrase_maintaining_7));
        linkedHashMap.put("PRODUCTIVE_1", Integer.valueOf(R.string.training_status_feedback_phrase_productive_1));
        linkedHashMap.put("PRODUCTIVE_2", Integer.valueOf(R.string.training_status_feedback_phrase_productive_2));
        Integer numValueOf2 = Integer.valueOf(R.string.training_status_feedback_phrase_productive_3);
        linkedHashMap.put("PRODUCTIVE_3", numValueOf2);
        linkedHashMap.put("PRODUCTIVE_4", Integer.valueOf(R.string.training_status_feedback_phrase_productive_4));
        linkedHashMap.put("PRODUCTIVE_5", numValueOf2);
        linkedHashMap.put("PRODUCTIVE_6", Integer.valueOf(R.string.training_status_feedback_phrase_productive_6));
        linkedHashMap.put("PRODUCTIVE_7", Integer.valueOf(R.string.training_status_feedback_phrase_productive_7));
        linkedHashMap.put("PRODUCTIVE_8", Integer.valueOf(R.string.training_status_feedback_phrase_productive_8));
        linkedHashMap.put("PRODUCTIVE_9", Integer.valueOf(R.string.training_status_feedback_phrase_productive_9));
        linkedHashMap.put("PRODUCTIVE_10", Integer.valueOf(R.string.training_status_feedback_phrase_productive_10));
        linkedHashMap.put("PEAKING_1", Integer.valueOf(R.string.training_status_feedback_phrase_peaking_1));
        linkedHashMap.put("PEAKING_2", Integer.valueOf(R.string.training_status_feedback_phrase_peaking_2));
        linkedHashMap.put("OVERREACHING_1", Integer.valueOf(R.string.training_status_feedback_phrase_overreaching_1));
        linkedHashMap.put("OVERREACHING_2", Integer.valueOf(R.string.training_status_feedback_phrase_overreaching_2));
        linkedHashMap.put("OVERREACHING_3", Integer.valueOf(R.string.training_status_feedback_phrase_overreaching_3));
        linkedHashMap.put("OVERREACHING_4", Integer.valueOf(R.string.training_status_feedback_phrase_overreaching_4));
        linkedHashMap.put("OVERREACHING_5", Integer.valueOf(R.string.training_status_feedback_phrase_overreaching_5));
        linkedHashMap.put("UNPRODUCTIVE_1", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_1));
        linkedHashMap.put("UNPRODUCTIVE_2", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_2));
        linkedHashMap.put("UNPRODUCTIVE_3", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_3));
        linkedHashMap.put("UNPRODUCTIVE_4", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_4));
        linkedHashMap.put("UNPRODUCTIVE_5", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_5));
        linkedHashMap.put("UNPRODUCTIVE_6", Integer.valueOf(R.string.training_status_feedback_phrase_unproductive_6));
        linkedHashMap.put("STRAINED_1", Integer.valueOf(R.string.training_status_feedback_phrase_strained_1));
        linkedHashMap.put("STRAINED_2", Integer.valueOf(R.string.training_status_feedback_phrase_strained_2));
        linkedHashMap.put("STRAINED_3", Integer.valueOf(R.string.training_status_feedback_phrase_strained_3));
        linkedHashMap.put("STRAINED_4", Integer.valueOf(R.string.training_status_feedback_phrase_strained_4));
        linkedHashMap.put("STRAINED_5", Integer.valueOf(R.string.training_status_feedback_phrase_strained_5));
        linkedHashMap.put("UNKNOWN", Integer.valueOf(R.string.msg_training_status_no_data));
    }
}
