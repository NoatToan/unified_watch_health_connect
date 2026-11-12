package ohos.ace.plugin.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class Accessibility {
    private static final String ACCESSIBILITY_STATE_CHANGE_STRING = "accessibilityStateChange";
    private static final String LOG_TAG = "Accessibility";
    private Context mContext;
    private AccessibilityManager accessibilityManager = null;
    private AccessibilityManager.AccessibilityStateChangeListener stateChangeListener = null;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener = null;

    public static class AccessibilityAbilityInfo {
        public boolean needHide;
        public String id = "";
        public String name = "";
        public String bundleName = "";
        public List<String> targetBundleNames = new ArrayList();
        public List<String> abilityTypes = new ArrayList();
        public List<String> capabilities = new ArrayList();
        public String description = "";
        public List<String> eventTypes = new ArrayList();
        public String label = "";
    }

    public native void nativeInit();

    protected native void onAccessibilityStateChangedCallback(boolean z, String str);

    public Accessibility(Context context) {
        this.mContext = context;
        nativeInit();
    }

    public List<AccessibilityAbilityInfo> getAccessibilityExtensionList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        getSystemService();
        if (this.accessibilityManager != null) {
            int iMapAbilityTypeToFeedbackType = mapAbilityTypeToFeedbackType(str);
            if (iMapAbilityTypeToFeedbackType == 0) {
                Log.e(LOG_TAG, "Invalid abilityType: " + str);
                return arrayList;
            }
            List<AccessibilityServiceInfo> serviceListByState = getServiceListByState(str2, iMapAbilityTypeToFeedbackType);
            if (serviceListByState == null) {
                Log.e(LOG_TAG, "Invalid serviceList");
                return arrayList;
            }
            populateAccessibilityAbilityInfoList(arrayList, serviceListByState);
            if (!"all".equals(str)) {
                filterAccessibilityAbilityInfoList(arrayList, str);
            }
        }
        return arrayList;
    }

    private void filterAccessibilityAbilityInfoList(List<AccessibilityAbilityInfo> list, String str) {
        Iterator<AccessibilityAbilityInfo> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().abilityTypes.contains(str)) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private List<AccessibilityServiceInfo> getServiceListByState(String str, int i) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1298848381) {
            if (iHashCode != 1671308008) {
                if (iHashCode == 1957569947 && str.equals(JsbMapKeyNames.H5_TEXT_DOWNLOAD_INSTALL)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("disable")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(k.g)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return this.accessibilityManager.getEnabledAccessibilityServiceList(i);
        }
        if (b2 == 1) {
            return getDisabledAccessibilityServices(i);
        }
        if (b2 == 2) {
            return this.accessibilityManager.getInstalledAccessibilityServiceList();
        }
        return new ArrayList();
    }

    private List<AccessibilityServiceInfo> getDisabledAccessibilityServices(int i) {
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = this.accessibilityManager.getInstalledAccessibilityServiceList();
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(i);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getId());
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : installedAccessibilityServiceList) {
            if (!hashSet.contains(accessibilityServiceInfo.getId())) {
                arrayList.add(accessibilityServiceInfo);
            }
        }
        return arrayList;
    }

    private void populateAccessibilityAbilityInfoList(List<AccessibilityAbilityInfo> list, List<AccessibilityServiceInfo> list2) {
        Iterator<AccessibilityServiceInfo> it = list2.iterator();
        while (it.hasNext()) {
            list.add(createAccessibilityAbilityInfo(it.next()));
        }
    }

    private AccessibilityAbilityInfo createAccessibilityAbilityInfo(AccessibilityServiceInfo accessibilityServiceInfo) {
        AccessibilityAbilityInfo accessibilityAbilityInfo = new AccessibilityAbilityInfo();
        accessibilityAbilityInfo.id = accessibilityServiceInfo.getId();
        accessibilityAbilityInfo.name = accessibilityServiceInfo.getSettingsActivityName();
        accessibilityAbilityInfo.bundleName = accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName;
        accessibilityAbilityInfo.description = accessibilityServiceInfo.loadDescription(this.mContext.getPackageManager());
        extractAbilityTypes(accessibilityAbilityInfo, accessibilityServiceInfo);
        extractCapabilities(accessibilityAbilityInfo, accessibilityServiceInfo);
        extractEventTypes(accessibilityAbilityInfo, accessibilityServiceInfo);
        accessibilityAbilityInfo.targetBundleNames = new ArrayList();
        if (accessibilityServiceInfo.packageNames != null) {
            for (String str : accessibilityServiceInfo.packageNames) {
                accessibilityAbilityInfo.targetBundleNames.add(str);
            }
        }
        accessibilityAbilityInfo.needHide = false;
        return accessibilityAbilityInfo;
    }

    private void extractAbilityTypes(AccessibilityAbilityInfo accessibilityAbilityInfo, AccessibilityServiceInfo accessibilityServiceInfo) {
        accessibilityAbilityInfo.abilityTypes = new ArrayList();
        int i = accessibilityServiceInfo.feedbackType;
        if ((i & 4) != 0) {
            accessibilityAbilityInfo.abilityTypes.add("audible");
        }
        if ((i & 1) != 0) {
            accessibilityAbilityInfo.abilityTypes.add("spoken");
        }
        if ((i & 8) != 0) {
            accessibilityAbilityInfo.abilityTypes.add("visual");
        }
        if ((i & 2) != 0) {
            accessibilityAbilityInfo.abilityTypes.add("haptic");
        }
        if ((i & 16) != 0) {
            accessibilityAbilityInfo.abilityTypes.add("generic");
        }
    }

    private void extractCapabilities(AccessibilityAbilityInfo accessibilityAbilityInfo, AccessibilityServiceInfo accessibilityServiceInfo) {
        accessibilityAbilityInfo.capabilities = new ArrayList();
        int capabilities = accessibilityServiceInfo.getCapabilities();
        if (capabilities != 0) {
            if ((capabilities & 1) != 0) {
                accessibilityAbilityInfo.capabilities.add("retrieve");
            }
            if ((capabilities & 2) != 0) {
                accessibilityAbilityInfo.capabilities.add("touchGuide");
            }
            if ((capabilities & 8) != 0) {
                accessibilityAbilityInfo.capabilities.add("keyEventObserver");
            }
            if ((capabilities & 16) != 0) {
                accessibilityAbilityInfo.capabilities.add("zoom");
            }
            if ((capabilities & 32) != 0) {
                accessibilityAbilityInfo.capabilities.add("gesture");
            }
        }
    }

    private void extractEventTypes(AccessibilityAbilityInfo accessibilityAbilityInfo, AccessibilityServiceInfo accessibilityServiceInfo) {
        accessibilityAbilityInfo.eventTypes = new ArrayList();
        int i = accessibilityServiceInfo.eventTypes;
        if (i != 0) {
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 32768, "accessibilityFocus");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 65536, "accessibilityFocusClear");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 1, "click");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 2, "longClick");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 8, "focus");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 4, "select");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 128, "hoverEnter");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 256, "hoverExit");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 16, "textUpdate");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 8192, "textSelectionUpdate");
            addEventTypeIfMatch(accessibilityAbilityInfo.eventTypes, i, 4096, "scroll");
        }
    }

    private void addEventTypeIfMatch(List<String> list, int i, int i2, String str) {
        if ((i & i2) != 0) {
            list.add(str);
        }
    }

    private int mapAbilityTypeToFeedbackType(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "haptic":
                b2 = 0;
                break;
            case "spoken":
                b2 = 1;
                break;
            case "visual":
                b2 = 2;
                break;
            case "audible":
                b2 = 3;
                break;
            case "generic":
                b2 = 4;
                break;
            case "all":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 2;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 8;
        }
        if (b2 == 3) {
            return 4;
        }
        if (b2 != 4) {
            return b2 != 5 ? 0 : -1;
        }
        return 16;
    }

    public boolean isAccessibilityEnabled() {
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    public void registerAccessibilityStateListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        if (this.stateChangeListener == null) {
            this.stateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: ohos.ace.plugin.accessibility.Accessibility.1
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public void onAccessibilityStateChanged(boolean z) {
                    Accessibility.this.onAccessibilityStateChangedCallback(z, Accessibility.ACCESSIBILITY_STATE_CHANGE_STRING);
                }
            };
        }
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || (accessibilityStateChangeListener = this.stateChangeListener) == null) {
            return;
        }
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    public void unRegisterAccessibilityStateListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || (accessibilityStateChangeListener = this.stateChangeListener) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        this.stateChangeListener = null;
    }

    public boolean isTouchExplorationEnabled() {
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }

    public void registerTouchExplorationListener() {
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
        if (this.touchExplorationListener == null) {
            this.touchExplorationListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ohos.ace.plugin.accessibility.Accessibility.2
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public void onTouchExplorationStateChanged(boolean z) {
                    Accessibility.this.onAccessibilityStateChangedCallback(z, "");
                }
            };
        }
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || (touchExplorationStateChangeListener = this.touchExplorationListener) == null) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public void unRegisterTouchExplorationListener() {
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
        getSystemService();
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || (touchExplorationStateChangeListener = this.touchExplorationListener) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        this.touchExplorationListener = null;
    }

    private void getSystemService() {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        }
    }
}
