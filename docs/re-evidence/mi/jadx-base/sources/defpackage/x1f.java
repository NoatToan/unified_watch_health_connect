package defpackage;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class x1f extends f4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1f f38575a;

    public class a implements odj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f38576a;

        public a(Map map) {
            this.f38576a = map;
        }

        @Override // defpackage.odj
        public Map<String, ReactModuleInfo> a() {
            return this.f38576a;
        }
    }

    public x1f() {
    }

    @Override // defpackage.f4q, defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ReactCheckBoxManager());
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactDropdownPickerManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new ARTSurfaceViewManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactViewPagerManager());
        arrayList.add(new ReactVirtualTextViewManager());
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.f4q
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2115067288:
                if (str.equals(ToastModule.NAME)) {
                    b2 = 0;
                }
                break;
            case -2033388651:
                if (str.equals(AsyncStorageModule.NAME)) {
                    b2 = 1;
                }
                break;
            case -1962922905:
                if (str.equals(ImageStoreManager.NAME)) {
                    b2 = 2;
                }
                break;
            case -1850625090:
                if (str.equals(SoundManagerModule.NAME)) {
                    b2 = 3;
                }
                break;
            case -1654566518:
                if (str.equals(DialogModule.NAME)) {
                    b2 = 4;
                }
                break;
            case -1505215509:
                if (str.equals(CameraRollManager.NAME)) {
                    b2 = 5;
                }
                break;
            case -1399423980:
                if (str.equals(TimePickerDialogModule.FRAGMENT_TAG)) {
                    b2 = 6;
                }
                break;
            case -1344126773:
                if (str.equals(FileReaderModule.NAME)) {
                    b2 = 7;
                }
                break;
            case -1062061717:
                if (str.equals(PermissionsModule.NAME)) {
                    b2 = 8;
                }
                break;
            case -657277650:
                if (str.equals(ImageLoaderModule.NAME)) {
                    b2 = 9;
                }
                break;
            case -570370161:
                if (str.equals(I18nManagerModule.NAME)) {
                    b2 = 10;
                }
                break;
            case -457866500:
                if (str.equals(AccessibilityInfoModule.NAME)) {
                    b2 = 11;
                }
                break;
            case -382654004:
                if (str.equals(StatusBarModule.NAME)) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case -254310125:
                if (str.equals(WebSocketModule.NAME)) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
            case 163245714:
                if (str.equals(FrescoModule.NAME)) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                }
                break;
            case 174691539:
                if (str.equals(DatePickerDialogModule.FRAGMENT_TAG)) {
                    b2 = 15;
                }
                break;
            case 283572496:
                if (str.equals(ImageEditingManager.NAME)) {
                    b2 = 16;
                }
                break;
            case 403570038:
                if (str.equals(ClipboardModule.NAME)) {
                    b2 = 17;
                }
                break;
            case 563961875:
                if (str.equals(IntentModule.NAME)) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                }
                break;
            case 1221389072:
                if (str.equals(AppStateModule.NAME)) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                }
                break;
            case 1515242260:
                if (str.equals(NetworkingModule.NAME)) {
                    b2 = 20;
                }
                break;
            case 1547941001:
                if (str.equals(BlobModule.NAME)) {
                    b2 = 21;
                }
                break;
            case 1555425035:
                if (str.equals(ShareModule.NAME)) {
                    b2 = 22;
                }
                break;
            case 1721274886:
                if (str.equals(NativeAnimatedModule.NAME)) {
                    b2 = 23;
                }
                break;
            case 1922110066:
                if (str.equals(VibrationModule.NAME)) {
                    b2 = 24;
                }
                break;
        }
        switch (b2) {
            case 0:
                return new ToastModule(reactApplicationContext);
            case 1:
                return new AsyncStorageModule(reactApplicationContext);
            case 2:
                return new ImageStoreManager(reactApplicationContext);
            case 3:
                return new SoundManagerModule(reactApplicationContext);
            case 4:
                return new DialogModule(reactApplicationContext);
            case 5:
                return new CameraRollManager(reactApplicationContext);
            case 6:
                return new TimePickerDialogModule(reactApplicationContext);
            case 7:
                return new FileReaderModule(reactApplicationContext);
            case 8:
                return new PermissionsModule(reactApplicationContext);
            case 9:
                return new ImageLoaderModule(reactApplicationContext);
            case 10:
                return new I18nManagerModule(reactApplicationContext);
            case 11:
                return new AccessibilityInfoModule(reactApplicationContext);
            case 12:
                return new StatusBarModule(reactApplicationContext);
            case 13:
                return new WebSocketModule(reactApplicationContext);
            case 14:
                w1f w1fVar = this.f38575a;
                return new FrescoModule(reactApplicationContext, true, w1fVar != null ? w1fVar.a() : null);
            case 15:
                return new DatePickerDialogModule(reactApplicationContext);
            case 16:
                return new ImageEditingManager(reactApplicationContext);
            case 17:
                return new ClipboardModule(reactApplicationContext);
            case 18:
                return new IntentModule(reactApplicationContext);
            case 19:
                return new AppStateModule(reactApplicationContext);
            case 20:
                return new NetworkingModule(reactApplicationContext);
            case 21:
                return new BlobModule(reactApplicationContext);
            case 22:
                return new ShareModule(reactApplicationContext);
            case 23:
                return new NativeAnimatedModule(reactApplicationContext);
            case 24:
                return new VibrationModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // defpackage.f4q
    public odj getReactModuleInfoProvider() {
        try {
            return (odj) Class.forName("com.facebook.react.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AccessibilityInfoModule.class, AppStateModule.class, BlobModule.class, FileReaderModule.class, AsyncStorageModule.class, CameraRollManager.class, ClipboardModule.class, DatePickerDialogModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageEditingManager.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, TimePickerDialogModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
            HashMap map = new HashMap();
            for (int i = 0; i < 25; i++) {
                Class cls = clsArr[i];
                ndj ndjVar = (ndj) cls.getAnnotation(ndj.class);
                map.put(ndjVar.name(), new ReactModuleInfo(ndjVar.name(), cls.getName(), ndjVar.canOverrideExistingModule(), ndjVar.needsEagerInit(), ndjVar.hasConstants(), ndjVar.isCxxModule(), false));
            }
            return new a(map);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        }
    }

    public x1f(w1f w1fVar) {
        this.f38575a = w1fVar;
    }
}
