package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh2/l;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum l {
    ALERT_VOLUME("alertVolume"),
    CONTAINER(TtmlNode.RUBY_CONTAINER),
    DEVICE("device"),
    DOUBLE_LABEL("doubleLabel"),
    FIND_MY_DEVICE("findMyDevice"),
    FEATURE_SETUP("featureSetup"),
    HEADER("header"),
    INTERACTIVE_TEXT("interactiveText"),
    LINK_BUTTON("linkButton"),
    PREFERRED_ACTIVITY_TRACKER("preferredActivityTracker"),
    SELECTION("selection"),
    SINGLE_LABEL("singleLabel"),
    SPACER("spacer"),
    SWITCH("toggle"),
    PULSE_OX("pulseOx"),
    BLOOD_EFFICIENCY("bloodEfficiency"),
    TEXT("text"),
    HAND_ALIGNMENT("handAlignment"),
    CRITICAL_SWIM_SPEED("criticalSwimSpeed");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118654a;

    l(String str) {
        this.f118654a = str;
    }
}
