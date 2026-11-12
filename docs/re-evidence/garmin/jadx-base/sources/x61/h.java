package x61;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx61/h;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f189241b;

    public h(String str) {
        str.getClass();
        this.f189240a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f189241b = linkedHashMap;
        Integer numValueOf = Integer.valueOf(R.string.msg_training_status_no_data);
        linkedHashMap.put("UNKNOWN", numValueOf);
        linkedHashMap.put("NO_STATUS_NO_RESULT", null);
        linkedHashMap.put("NO_STATUS_BELOW_TARGETS", numValueOf);
        linkedHashMap.put("NO_STATUS_AER_LOW_SHORT", numValueOf);
        linkedHashMap.put("NO_STATUS_AER_HIGH_SHORT", numValueOf);
        linkedHashMap.put("NO_STATUS_ANAER_SHORT", numValueOf);
        linkedHashMap.put("NO_STATUS_BALANCED", numValueOf);
        linkedHashMap.put("NO_STATUS_AER_LOW_FOCUS", numValueOf);
        linkedHashMap.put("NO_STATUS_AER_HIGH_FOCUS", numValueOf);
        linkedHashMap.put("NO_STATUS_ANAER_FOCUS", numValueOf);
        linkedHashMap.put("NO_STATUS_ABOVE_TARGETS", numValueOf);
        linkedHashMap.put("DETRAINING", Integer.valueOf(R.string.training_status_detraining_help_text));
        linkedHashMap.put("DETRAINING_NO_RESULT", null);
        Integer numValueOf2 = Integer.valueOf(R.string.msg_detraining_message_ts);
        linkedHashMap.put("DETRAINING_BELOW_TARGETS", numValueOf2);
        linkedHashMap.put("DETRAINING_AER_LOW_SHORT", numValueOf2);
        linkedHashMap.put("DETRAINING_AER_HIGH_SHORT", numValueOf2);
        linkedHashMap.put("DETRAINING_ANAER_SHORT", numValueOf2);
        linkedHashMap.put("DETRAINING_BALANCED", numValueOf2);
        linkedHashMap.put("DETRAINING_AER_LOW_FOCUS", numValueOf2);
        linkedHashMap.put("DETRAINING_AER_HIGH_FOCUS", numValueOf2);
        linkedHashMap.put("DETRAINING_ANAER_FOCUS", numValueOf2);
        linkedHashMap.put("DETRAINING_ABOVE_TARGETS", numValueOf2);
        linkedHashMap.put("RECOVERY", Integer.valueOf(R.string.training_status_recovery_help_text));
        linkedHashMap.put("RECOVERY_NO_RESULT", null);
        linkedHashMap.put("RECOVERY_BELOW_TARGETS", Integer.valueOf(R.string.msg_recovery_below_targets_message_ts));
        Integer numValueOf3 = Integer.valueOf(R.string.msg_recovery_short_message_ts);
        linkedHashMap.put("RECOVERY_AER_LOW_SHORT", numValueOf3);
        linkedHashMap.put("RECOVERY_AER_HIGH_SHORT", numValueOf3);
        linkedHashMap.put("RECOVERY_ANAER_SHORT", numValueOf3);
        Integer numValueOf4 = Integer.valueOf(R.string.msg_recovery_balanced_and_focus_message_ts);
        linkedHashMap.put("RECOVERY_BALANCED", numValueOf4);
        linkedHashMap.put("RECOVERY_AER_LOW_FOCUS", numValueOf4);
        linkedHashMap.put("RECOVERY_AER_HIGH_FOCUS", numValueOf4);
        linkedHashMap.put("RECOVERY_ANAER_FOCUS", numValueOf4);
        linkedHashMap.put("RECOVERY_ABOVE_TARGETS", Integer.valueOf(R.string.msg_recovery_above_targets_message_ts));
        linkedHashMap.put("MAINTAINING", Integer.valueOf(R.string.training_status_maintaining_help_text));
        linkedHashMap.put("MAINTAINING_NO_RESULT", null);
        Integer numValueOf5 = Integer.valueOf(R.string.msg_maintaining_below_targets_short_message_ts);
        linkedHashMap.put("MAINTAINING_BELOW_TARGETS", numValueOf5);
        linkedHashMap.put("MAINTAINING_AER_LOW_SHORT", numValueOf5);
        linkedHashMap.put("MAINTAINING_AER_HIGH_SHORT", numValueOf5);
        linkedHashMap.put("MAINTAINING_ANAER_SHORT", numValueOf5);
        linkedHashMap.put("MAINTAINING_BALANCED", Integer.valueOf(R.string.msg_maintaining_balanced_message_ts));
        Integer numValueOf6 = Integer.valueOf(R.string.msg_maintaining_focus_message_ts);
        linkedHashMap.put("MAINTAINING_AER_LOW_FOCUS", numValueOf6);
        linkedHashMap.put("MAINTAINING_AER_HIGH_FOCUS", numValueOf6);
        linkedHashMap.put("MAINTAINING_ANAER_FOCUS", numValueOf6);
        linkedHashMap.put("MAINTAINING_ABOVE_TARGETS", Integer.valueOf(R.string.msg_maintaining_above_targets_message_ts));
        linkedHashMap.put("PRODUCTIVE", Integer.valueOf(R.string.training_status_productive_help_text));
        linkedHashMap.put("PRODUCTIVE_NO_RESULT", null);
        linkedHashMap.put("PRODUCTIVE_BELOW_TARGETS", Integer.valueOf(R.string.msg_productive_below_targets_message_ts));
        Integer numValueOf7 = Integer.valueOf(R.string.msg_productive_short_message_ts);
        linkedHashMap.put("PRODUCTIVE_AER_LOW_SHORT", numValueOf7);
        linkedHashMap.put("PRODUCTIVE_AER_HIGH_SHORT", numValueOf7);
        linkedHashMap.put("PRODUCTIVE_ANAER_SHORT", numValueOf7);
        Integer numValueOf8 = Integer.valueOf(R.string.msg_productive_balanced_and_focus_message_ts);
        linkedHashMap.put("PRODUCTIVE_BALANCED", numValueOf8);
        linkedHashMap.put("PRODUCTIVE_AER_LOW_FOCUS", numValueOf8);
        linkedHashMap.put("PRODUCTIVE_AER_HIGH_FOCUS", numValueOf8);
        linkedHashMap.put("PRODUCTIVE_ANAER_FOCUS", numValueOf8);
        linkedHashMap.put("PRODUCTIVE_ABOVE_TARGETS", Integer.valueOf(R.string.msg_productive_above_targets_message_ts));
        linkedHashMap.put("PEAKING", Integer.valueOf(R.string.training_status_peaking_help_text));
        linkedHashMap.put("PEAKING_NO_RESULT", null);
        linkedHashMap.put("PEAKING_BELOW_TARGETS", Integer.valueOf(R.string.msg_peaking_balanced_and_focus_message_ts));
        Integer numValueOf9 = Integer.valueOf(R.string.msg_peaking_short_message_ts);
        linkedHashMap.put("PEAKING_AER_LOW_SHORT", numValueOf9);
        linkedHashMap.put("PEAKING_AER_HIGH_SHORT", numValueOf9);
        linkedHashMap.put("PEAKING_ANAER_SHORT", numValueOf9);
        Integer numValueOf10 = Integer.valueOf(R.string.msg_peaking_below_targets_message_ts);
        linkedHashMap.put("PEAKING_BALANCED", numValueOf10);
        linkedHashMap.put("PEAKING_AER_LOW_FOCUS", numValueOf10);
        linkedHashMap.put("PEAKING_AER_HIGH_FOCUS", numValueOf10);
        linkedHashMap.put("PEAKING_ANAER_FOCUS", numValueOf10);
        linkedHashMap.put("PEAKING_ABOVE_TARGETS", Integer.valueOf(R.string.msg_peaking_above_targets_message_ts));
        linkedHashMap.put("OVERREACHING", Integer.valueOf(R.string.training_status_overreaching_help_text));
        linkedHashMap.put("OVERREACHING_NO_RESULT", null);
        linkedHashMap.put("OVERREACHING_BELOW_TARGETS", Integer.valueOf(R.string.msg_overreaching_below_targets_message_ts));
        Integer numValueOf11 = Integer.valueOf(R.string.msg_overreaching_ae_low_short_ae_high_anaer_focus_message_ts);
        linkedHashMap.put("OVERREACHING_AER_LOW_SHORT", numValueOf11);
        Integer numValueOf12 = Integer.valueOf(R.string.msg_overreaching_short_balanced_focus_message_ts);
        linkedHashMap.put("OVERREACHING_AER_HIGH_SHORT", numValueOf12);
        linkedHashMap.put("OVERREACHING_ANAER_SHORT", numValueOf12);
        linkedHashMap.put("OVERREACHING_BALANCED", numValueOf12);
        linkedHashMap.put("OVERREACHING_AER_LOW_FOCUS", numValueOf12);
        linkedHashMap.put("OVERREACHING_AER_HIGH_FOCUS", numValueOf11);
        linkedHashMap.put("OVERREACHING_ANAER_FOCUS", numValueOf11);
        linkedHashMap.put("OVERREACHING_ABOVE_TARGETS", Integer.valueOf(R.string.msg_overreaching_above_targets_message_ts));
        linkedHashMap.put("UNPRODUCTIVE", Integer.valueOf(R.string.training_status_unproductive_help_text));
        linkedHashMap.put("UNPRODUCTIVE_NO_RESULT", null);
        linkedHashMap.put("UNPRODUCTIVE_BELOW_TARGETS", Integer.valueOf(R.string.msg_unproductive_below_targets_message_ts));
        linkedHashMap.put("UNPRODUCTIVE_AER_LOW_SHORT", Integer.valueOf(R.string.msg_unproductive_ae_low_short_message_ts));
        linkedHashMap.put("UNPRODUCTIVE_AER_HIGH_SHORT", Integer.valueOf(R.string.msg_unproductive_ae_high_short_message_ts));
        linkedHashMap.put("UNPRODUCTIVE_ANAER_SHORT", Integer.valueOf(R.string.msg_unproductive_anaer_short_message_ts));
        Integer numValueOf13 = Integer.valueOf(R.string.msg_unproductive_balanced_focus_message_ts);
        linkedHashMap.put("UNPRODUCTIVE_BALANCED", numValueOf13);
        linkedHashMap.put("UNPRODUCTIVE_AER_LOW_FOCUS", numValueOf13);
        linkedHashMap.put("UNPRODUCTIVE_AER_HIGH_FOCUS", numValueOf13);
        linkedHashMap.put("UNPRODUCTIVE_ANAER_FOCUS", numValueOf13);
        linkedHashMap.put("UNPRODUCTIVE_ABOVE_TARGETS", Integer.valueOf(R.string.msg_unproductive_above_targets_message_ts));
    }
}
