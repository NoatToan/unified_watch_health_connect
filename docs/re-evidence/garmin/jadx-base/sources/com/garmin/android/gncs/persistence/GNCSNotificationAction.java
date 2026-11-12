package com.garmin.android.gncs.persistence;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import w13.a;
import w13.b;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0016B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/gncs/persistence/GNCSNotificationAction;", "", TtmlNode.ATTR_ID, "", "title", "", "requiresInput", "", "actionType", "Lcom/garmin/android/gncs/persistence/GNCSNotificationAction$ActionType;", "dismissAction", "(ILjava/lang/String;ZLcom/garmin/android/gncs/persistence/GNCSNotificationAction$ActionType;Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ActionType", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GNCSNotificationAction {
    public ActionType actionType;
    public boolean dismissAction;
    public final int id;
    public final boolean requiresInput;
    public final String title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/gncs/persistence/GNCSNotificationAction$ActionType;", "", "(Ljava/lang/String;I)V", "NEUTRAL", "POSITIVE", "NEGATIVE", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ActionType {
        NEUTRAL,
        POSITIVE,
        NEGATIVE;

        private static final /* synthetic */ a $ENTRIES = b.g(values());

        public static a<ActionType> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ GNCSNotificationAction(int i14, String str, boolean z14, ActionType actionType, boolean z15, int i15, j jVar) {
        this(i14, str, z14, (i15 & 8) != 0 ? ActionType.NEUTRAL : actionType, (i15 & 16) != 0 ? false : z15);
    }

    public static /* synthetic */ GNCSNotificationAction copy$default(GNCSNotificationAction gNCSNotificationAction, int i14, String str, boolean z14, ActionType actionType, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i14 = gNCSNotificationAction.id;
        }
        if ((i15 & 2) != 0) {
            str = gNCSNotificationAction.title;
        }
        if ((i15 & 4) != 0) {
            z14 = gNCSNotificationAction.requiresInput;
        }
        if ((i15 & 8) != 0) {
            actionType = gNCSNotificationAction.actionType;
        }
        if ((i15 & 16) != 0) {
            z15 = gNCSNotificationAction.dismissAction;
        }
        boolean z16 = z15;
        boolean z17 = z14;
        return gNCSNotificationAction.copy(i14, str, z17, actionType, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRequiresInput() {
        return this.requiresInput;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDismissAction() {
        return this.dismissAction;
    }

    public final GNCSNotificationAction copy(int id3, String title, boolean requiresInput, ActionType actionType, boolean dismissAction) {
        title.getClass();
        actionType.getClass();
        return new GNCSNotificationAction(id3, title, requiresInput, actionType, dismissAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GNCSNotificationAction)) {
            return false;
        }
        GNCSNotificationAction gNCSNotificationAction = (GNCSNotificationAction) other;
        return this.id == gNCSNotificationAction.id && s.g(this.title, gNCSNotificationAction.title) && this.requiresInput == gNCSNotificationAction.requiresInput && this.actionType == gNCSNotificationAction.actionType && this.dismissAction == gNCSNotificationAction.dismissAction;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dismissAction) + ((this.actionType.hashCode() + f.g(g.j(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.requiresInput)) * 31);
    }

    public String toString() {
        int i14 = this.id;
        String str = this.title;
        boolean z14 = this.requiresInput;
        ActionType actionType = this.actionType;
        boolean z15 = this.dismissAction;
        StringBuilder sbR = g.r(i14, "GNCSNotificationAction(id=", ", title=", str, ", requiresInput=");
        sbR.append(z14);
        sbR.append(", actionType=");
        sbR.append(actionType);
        sbR.append(", dismissAction=");
        return hb.a.k(sbR, z15, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GNCSNotificationAction(int i14, String str, boolean z14, ActionType actionType) {
        this(i14, str, z14, actionType, false, 16, null);
        str.getClass();
        actionType.getClass();
    }

    public GNCSNotificationAction(int i14, String str, boolean z14, ActionType actionType, boolean z15) {
        str.getClass();
        actionType.getClass();
        this.id = i14;
        this.title = str;
        this.requiresInput = z14;
        this.actionType = actionType;
        this.dismissAction = z15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GNCSNotificationAction(int i14, String str, boolean z14) {
        this(i14, str, z14, null, false, 24, null);
        str.getClass();
    }
}
