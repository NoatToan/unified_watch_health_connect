package com.garmin.android.gncs.actionhandler;

import com.garmin.android.gncs.SmartNotificationsUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/gncs/actionhandler/ActionSettings;", "", "addBlockAppAction", "", "getAddBlockAppAction", "()Z", "setAddBlockAppAction", "(Z)V", "addDismissAppAction", "getAddDismissAppAction", "setAddDismissAppAction", "forceSilentWhenDoNotDisturb", "getForceSilentWhenDoNotDisturb", "setForceSilentWhenDoNotDisturb", "onlyUseWearableActions", "getOnlyUseWearableActions", "setOnlyUseWearableActions", "preferWearableActions", "getPreferWearableActions", "setPreferWearableActions", "useSimpleActions", "getUseSimpleActions", "setUseSimpleActions", "Companion", "Customized", "Default", "Lcom/garmin/android/gncs/actionhandler/ActionSettings$Customized;", "Lcom/garmin/android/gncs/actionhandler/ActionSettings$Default;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActionSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/gncs/actionhandler/ActionSettings$Companion;", "", "()V", "ADD_BLOCK_APP_ACTION", "", "ADD_DISMISS_APP_ACTION", "DEFAULT", "FORCE_SILENT_WHEN_DO_NOT_DISTURB", "ONLY_USE_WEARABLE_ACTIONS", "PREFER_WEARABLE_ACTIONS", "USE_SIMPLE_ACTIONS", "actionHandlersSettings", "", "Lcom/garmin/android/gncs/actionhandler/ActionSettings;", "default", "getDefault$annotations", "getDefault", "()Lcom/garmin/android/gncs/actionhandler/ActionSettings;", "getBy", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "loadDynamically", "", "json", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String ADD_BLOCK_APP_ACTION = "addBlockAppAction";
        private static final String ADD_DISMISS_APP_ACTION = "addDismissAppAction";
        private static final String DEFAULT = "default";
        private static final String FORCE_SILENT_WHEN_DO_NOT_DISTURB = "forceSilentWhenDoNotDisturb";
        private static final String ONLY_USE_WEARABLE_ACTIONS = "onlyUseWearableActions";
        private static final String PREFER_WEARABLE_ACTIONS = "preferWearableActions";
        private static final String USE_SIMPLE_ACTIONS = "useSimpleActions";
        private static final Map<String, ActionSettings> actionHandlersSettings;
        private static final ActionSettings default;

        static {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("default", new Default(false, false, false, false, false, false, 63, null));
            linkedHashMap.put(SmartNotificationsUtil.Packages.ONGOING_PACKAGE_NAME, new Customized(false, false, false, false, true, true));
            actionHandlersSettings = linkedHashMap;
            Object obj = linkedHashMap.get("default");
            obj.getClass();
            default = (ActionSettings) obj;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public final ActionSettings getBy(String packageName) {
            if (packageName != null) {
                ActionSettings actionSettings = actionHandlersSettings.get(packageName);
                if (actionSettings == null) {
                    actionSettings = default;
                }
                if (actionSettings != null) {
                    return actionSettings;
                }
            }
            return default;
        }

        public final ActionSettings getDefault() {
            return default;
        }

        public final void loadDynamically(String json) {
            json.getClass();
            JSONArray jSONArray = new JSONArray(json);
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i14);
                String strOptString = jSONObjectOptJSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean(ADD_DISMISS_APP_ACTION);
                boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean(ADD_BLOCK_APP_ACTION);
                boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean(PREFER_WEARABLE_ACTIONS);
                boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean(ONLY_USE_WEARABLE_ACTIONS);
                boolean zOptBoolean5 = jSONObjectOptJSONObject.optBoolean(USE_SIMPLE_ACTIONS);
                boolean zOptBoolean6 = jSONObjectOptJSONObject.optBoolean(FORCE_SILENT_WHEN_DO_NOT_DISTURB);
                strOptString.getClass();
                if (strOptString.length() > 0) {
                    actionHandlersSettings.put(strOptString, new Customized(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/garmin/android/gncs/actionhandler/ActionSettings$Customized;", "Lcom/garmin/android/gncs/actionhandler/ActionSettings;", "addDismissAppAction", "", "addBlockAppAction", "preferWearableActions", "onlyUseWearableActions", "useSimpleActions", "forceSilentWhenDoNotDisturb", "(ZZZZZZ)V", "getAddBlockAppAction", "()Z", "setAddBlockAppAction", "(Z)V", "getAddDismissAppAction", "setAddDismissAppAction", "getForceSilentWhenDoNotDisturb", "setForceSilentWhenDoNotDisturb", "getOnlyUseWearableActions", "setOnlyUseWearableActions", "getPreferWearableActions", "setPreferWearableActions", "getUseSimpleActions", "setUseSimpleActions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Customized implements ActionSettings {
        private boolean addBlockAppAction;
        private boolean addDismissAppAction;
        private boolean forceSilentWhenDoNotDisturb;
        private boolean onlyUseWearableActions;
        private boolean preferWearableActions;
        private boolean useSimpleActions;

        public Customized(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
            this.addDismissAppAction = z14;
            this.addBlockAppAction = z15;
            this.preferWearableActions = z16;
            this.onlyUseWearableActions = z17;
            this.useSimpleActions = z18;
            this.forceSilentWhenDoNotDisturb = z19;
        }

        public static /* synthetic */ Customized copy$default(Customized customized, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = customized.addDismissAppAction;
            }
            if ((i14 & 2) != 0) {
                z15 = customized.addBlockAppAction;
            }
            if ((i14 & 4) != 0) {
                z16 = customized.preferWearableActions;
            }
            if ((i14 & 8) != 0) {
                z17 = customized.onlyUseWearableActions;
            }
            if ((i14 & 16) != 0) {
                z18 = customized.useSimpleActions;
            }
            if ((i14 & 32) != 0) {
                z19 = customized.forceSilentWhenDoNotDisturb;
            }
            boolean z24 = z18;
            boolean z25 = z19;
            return customized.copy(z14, z15, z16, z17, z24, z25);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAddDismissAppAction() {
            return this.addDismissAppAction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAddBlockAppAction() {
            return this.addBlockAppAction;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getPreferWearableActions() {
            return this.preferWearableActions;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getOnlyUseWearableActions() {
            return this.onlyUseWearableActions;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getUseSimpleActions() {
            return this.useSimpleActions;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getForceSilentWhenDoNotDisturb() {
            return this.forceSilentWhenDoNotDisturb;
        }

        public final Customized copy(boolean addDismissAppAction, boolean addBlockAppAction, boolean preferWearableActions, boolean onlyUseWearableActions, boolean useSimpleActions, boolean forceSilentWhenDoNotDisturb) {
            return new Customized(addDismissAppAction, addBlockAppAction, preferWearableActions, onlyUseWearableActions, useSimpleActions, forceSilentWhenDoNotDisturb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Customized)) {
                return false;
            }
            Customized customized = (Customized) other;
            return this.addDismissAppAction == customized.addDismissAppAction && this.addBlockAppAction == customized.addBlockAppAction && this.preferWearableActions == customized.preferWearableActions && this.onlyUseWearableActions == customized.onlyUseWearableActions && this.useSimpleActions == customized.useSimpleActions && this.forceSilentWhenDoNotDisturb == customized.forceSilentWhenDoNotDisturb;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getAddBlockAppAction() {
            return this.addBlockAppAction;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getAddDismissAppAction() {
            return this.addDismissAppAction;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getForceSilentWhenDoNotDisturb() {
            return this.forceSilentWhenDoNotDisturb;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getOnlyUseWearableActions() {
            return this.onlyUseWearableActions;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getPreferWearableActions() {
            return this.preferWearableActions;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getUseSimpleActions() {
            return this.useSimpleActions;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceSilentWhenDoNotDisturb) + f.g(f.g(f.g(f.g(Boolean.hashCode(this.addDismissAppAction) * 31, 31, this.addBlockAppAction), 31, this.preferWearableActions), 31, this.onlyUseWearableActions), 31, this.useSimpleActions);
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setAddBlockAppAction(boolean z14) {
            this.addBlockAppAction = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setAddDismissAppAction(boolean z14) {
            this.addDismissAppAction = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setForceSilentWhenDoNotDisturb(boolean z14) {
            this.forceSilentWhenDoNotDisturb = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setOnlyUseWearableActions(boolean z14) {
            this.onlyUseWearableActions = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setPreferWearableActions(boolean z14) {
            this.preferWearableActions = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setUseSimpleActions(boolean z14) {
            this.useSimpleActions = z14;
        }

        public String toString() {
            boolean z14 = this.addDismissAppAction;
            boolean z15 = this.addBlockAppAction;
            boolean z16 = this.preferWearableActions;
            boolean z17 = this.onlyUseWearableActions;
            boolean z18 = this.useSimpleActions;
            boolean z19 = this.forceSilentWhenDoNotDisturb;
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Customized(addDismissAppAction=", ", addBlockAppAction=", ", preferWearableActions=", z14, z15);
            kg.f.q(", onlyUseWearableActions=", ", useSimpleActions=", sbM, z16, z17);
            return com.airbnb.lottie.animation.keyframe.a.f(", forceSilentWhenDoNotDisturb=", ")", sbM, z18, z19);
        }
    }

    static ActionSettings getBy(String str) {
        return INSTANCE.getBy(str);
    }

    static ActionSettings getDefault() {
        return INSTANCE.getDefault();
    }

    static void loadDynamically(String str) {
        INSTANCE.loadDynamically(str);
    }

    boolean getAddBlockAppAction();

    boolean getAddDismissAppAction();

    boolean getForceSilentWhenDoNotDisturb();

    boolean getOnlyUseWearableActions();

    boolean getPreferWearableActions();

    boolean getUseSimpleActions();

    void setAddBlockAppAction(boolean z14);

    void setAddDismissAppAction(boolean z14);

    void setForceSilentWhenDoNotDisturb(boolean z14);

    void setOnlyUseWearableActions(boolean z14);

    void setPreferWearableActions(boolean z14);

    void setUseSimpleActions(boolean z14);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/garmin/android/gncs/actionhandler/ActionSettings$Default;", "Lcom/garmin/android/gncs/actionhandler/ActionSettings;", "addDismissAppAction", "", "addBlockAppAction", "preferWearableActions", "onlyUseWearableActions", "useSimpleActions", "forceSilentWhenDoNotDisturb", "(ZZZZZZ)V", "getAddBlockAppAction", "()Z", "setAddBlockAppAction", "(Z)V", "getAddDismissAppAction", "setAddDismissAppAction", "getForceSilentWhenDoNotDisturb", "setForceSilentWhenDoNotDisturb", "getOnlyUseWearableActions", "setOnlyUseWearableActions", "getPreferWearableActions", "setPreferWearableActions", "getUseSimpleActions", "setUseSimpleActions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements ActionSettings {
        private boolean addBlockAppAction;
        private boolean addDismissAppAction;
        private boolean forceSilentWhenDoNotDisturb;
        private boolean onlyUseWearableActions;
        private boolean preferWearableActions;
        private boolean useSimpleActions;

        public /* synthetic */ Default(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19);
        }

        public static /* synthetic */ Default copy$default(Default r14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = r14.addDismissAppAction;
            }
            if ((i14 & 2) != 0) {
                z15 = r14.addBlockAppAction;
            }
            if ((i14 & 4) != 0) {
                z16 = r14.preferWearableActions;
            }
            if ((i14 & 8) != 0) {
                z17 = r14.onlyUseWearableActions;
            }
            if ((i14 & 16) != 0) {
                z18 = r14.useSimpleActions;
            }
            if ((i14 & 32) != 0) {
                z19 = r14.forceSilentWhenDoNotDisturb;
            }
            boolean z24 = z18;
            boolean z25 = z19;
            return r14.copy(z14, z15, z16, z17, z24, z25);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAddDismissAppAction() {
            return this.addDismissAppAction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAddBlockAppAction() {
            return this.addBlockAppAction;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getPreferWearableActions() {
            return this.preferWearableActions;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getOnlyUseWearableActions() {
            return this.onlyUseWearableActions;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getUseSimpleActions() {
            return this.useSimpleActions;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getForceSilentWhenDoNotDisturb() {
            return this.forceSilentWhenDoNotDisturb;
        }

        public final Default copy(boolean addDismissAppAction, boolean addBlockAppAction, boolean preferWearableActions, boolean onlyUseWearableActions, boolean useSimpleActions, boolean forceSilentWhenDoNotDisturb) {
            return new Default(addDismissAppAction, addBlockAppAction, preferWearableActions, onlyUseWearableActions, useSimpleActions, forceSilentWhenDoNotDisturb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r14 = (Default) other;
            return this.addDismissAppAction == r14.addDismissAppAction && this.addBlockAppAction == r14.addBlockAppAction && this.preferWearableActions == r14.preferWearableActions && this.onlyUseWearableActions == r14.onlyUseWearableActions && this.useSimpleActions == r14.useSimpleActions && this.forceSilentWhenDoNotDisturb == r14.forceSilentWhenDoNotDisturb;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getAddBlockAppAction() {
            return this.addBlockAppAction;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getAddDismissAppAction() {
            return this.addDismissAppAction;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getForceSilentWhenDoNotDisturb() {
            return this.forceSilentWhenDoNotDisturb;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getOnlyUseWearableActions() {
            return this.onlyUseWearableActions;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getPreferWearableActions() {
            return this.preferWearableActions;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public boolean getUseSimpleActions() {
            return this.useSimpleActions;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceSilentWhenDoNotDisturb) + f.g(f.g(f.g(f.g(Boolean.hashCode(this.addDismissAppAction) * 31, 31, this.addBlockAppAction), 31, this.preferWearableActions), 31, this.onlyUseWearableActions), 31, this.useSimpleActions);
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setAddBlockAppAction(boolean z14) {
            this.addBlockAppAction = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setAddDismissAppAction(boolean z14) {
            this.addDismissAppAction = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setForceSilentWhenDoNotDisturb(boolean z14) {
            this.forceSilentWhenDoNotDisturb = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setOnlyUseWearableActions(boolean z14) {
            this.onlyUseWearableActions = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setPreferWearableActions(boolean z14) {
            this.preferWearableActions = z14;
        }

        @Override // com.garmin.android.gncs.actionhandler.ActionSettings
        public void setUseSimpleActions(boolean z14) {
            this.useSimpleActions = z14;
        }

        public String toString() {
            boolean z14 = this.addDismissAppAction;
            boolean z15 = this.addBlockAppAction;
            boolean z16 = this.preferWearableActions;
            boolean z17 = this.onlyUseWearableActions;
            boolean z18 = this.useSimpleActions;
            boolean z19 = this.forceSilentWhenDoNotDisturb;
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Default(addDismissAppAction=", ", addBlockAppAction=", ", preferWearableActions=", z14, z15);
            kg.f.q(", onlyUseWearableActions=", ", useSimpleActions=", sbM, z16, z17);
            return com.airbnb.lottie.animation.keyframe.a.f(", forceSilentWhenDoNotDisturb=", ")", sbM, z18, z19);
        }

        public Default(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
            this.addDismissAppAction = z14;
            this.addBlockAppAction = z15;
            this.preferWearableActions = z16;
            this.onlyUseWearableActions = z17;
            this.useSimpleActions = z18;
            this.forceSilentWhenDoNotDisturb = z19;
        }

        public Default() {
            this(false, false, false, false, false, false, 63, null);
        }
    }
}
