package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceSnapshotCallback;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jqv implements InterfaceHiMap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38875c;
    private LinearLayout d;

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar, boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int addMarker(jrv jrvVar, GrowAnimationBuilder growAnimationBuilder) {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String addOverlay(jrz jrzVar) {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addSportStartMarker(jpg jpgVar, int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addStartMarker(jpg jpgVar, int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jpg jpgVar, long j, InterfaceMapCallback interfaceMapCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jru jruVar, int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void cancelAnimation() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeTrackColor(int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg convertLocationByCoordinate(Location location) {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawAddMapTracking(jpg jpgVar, jpg jpgVar2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawInterrupt(jpg jpgVar, jpg jpgVar2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(List<jpi> list) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jpg jpgVar, jpg jpgVar2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String drawLines(jrs jrsVar) {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void forceDrawLine() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getZoomToSpanLevel(jpg jpgVar, jpg jpgVar2) {
        return 15.0f;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void hideMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void intervalTrackMarkers(int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public boolean isAnimationStart() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadingEnd() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByLatLng(jpg jpgVar) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom(float f) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraLatLngBounds(List<jpg> list) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveToCenter() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCameraChangeListener() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreate(Bundle bundle, boolean z, boolean z2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroy() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(List<MotionData> list) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(jpg jpgVar, float f) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPause() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResume() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStart() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStop() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void pauseSportClear() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerAnimationListener(InterfaceMapCallback interfaceMapCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerLoadingListener(InterfaceMapCallback interfaceMapCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<jpg> requestSimplePoints() {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void resetTrackColor() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void saveAddress(MotionData motionData) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void screenShotToFile(InterfaceSnapshotCallback interfaceSnapshotCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void scrollBy(float f, float f2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setAllGesturesEnabled(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setIsStop(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineColor(int i, boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineVisible(String str, boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLogoPadding(int i, int i2, int i3, int i4) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIcon(int i, Bitmap bitmap) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIconPath(String str, String str2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOverlayVisible(String str, boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenter(int i, int i2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenterWhole(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScaleControlsEnabled(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScreenOnOrForegrand(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setShowMapEnd(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setSportTabCenter(DisplayMetrics displayMetrics) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setZoomControlsEnabled(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showOrHide(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showSatelLiteState(boolean z, boolean z2, int i) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void startMapAnimation(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void updateSportMarker(jpg jpgVar, BitmapDrawable bitmapDrawable) {
    }

    public jqv(Context context, LinearLayout linearLayout, boolean z) {
        this.d = linearLayout;
        this.f38875c = context;
        if (qqs.e(context)) {
            linearLayout.setBackgroundColor(this.f38875c.getResources().getColor(R.color.item_text_color));
        } else {
            linearLayout.setBackgroundColor(this.f38875c.getResources().getColor(R.color.message_detail_background));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void getMapScreenShot(Handler handler, MotionData motionData) {
        if (handler == null) {
            LogUtil.a("Track_EmptyMap", "handler is null");
            return;
        }
        Message messageObtain = Message.obtain(handler);
        messageObtain.obj = null;
        messageObtain.what = 1;
        messageObtain.sendToTarget();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapShowType(int i) {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            LogUtil.j("Track_EmptyMap", "mEmptyMapLayout is null");
        } else if (i == 3) {
            linearLayout.setBackgroundColor(this.f38875c.getResources().getColor(R.color.item_text_color));
        } else {
            linearLayout.setBackgroundColor(this.f38875c.getResources().getColor(R.color.message_detail_background));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, double[] dArr) {
        return new double[0];
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, Location location) {
        return new double[0];
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<Integer> addHiHealthMarkers(List<jpk> list) {
        return Collections.EMPTY_LIST;
    }
}
