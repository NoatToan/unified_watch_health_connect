package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.GroupRideShareProtobufRequestHandler;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import hk0.p;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/SendGroupRideCodeNotification;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SendGroupRideCodeNotification implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$1(Context context, EditText editText, DialogInterface dialogInterface, int i14) {
        ArrayList arrayListD = p.d();
        long unitId = !arrayListD.isEmpty() ? ((DeviceProfile) arrayListD.get(0)).getF92746j() : 0L;
        GDILiveTrackProto.GroupRideNotification.Builder builderNewBuilder = GDILiveTrackProto.GroupRideNotification.newBuilder();
        builderNewBuilder.setShareSessionCode(editText.getText().toString());
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder2.setGroupRideNotification(builderNewBuilder);
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder2.build();
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        liveTrackServiceBuild.getClass();
        builderNewBuilder3.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild);
        context.getClass();
        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
        smartBuild.getClass();
        new Thread(new GroupRideShareProtobufRequestHandler(context, unitId, smartBuild, 1010)).start();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.SEND_GROUP_RIDE_CODE_NOTIFICATION;
        return new mg1.a(dVar.f112244a, dVar.f112245b, dVar.f112246c, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    @SuppressLint({"SetTextI18n"})
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        FrameLayout frameLayout = new FrameLayout(contextA);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = contextA.getResources().getDimensionPixelSize(R.dimen.spacing_large);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.topMargin = dimensionPixelSize;
        EditText editText = new EditText(contextA);
        editText.setSingleLine();
        editText.setText("KK9ZV5");
        editText.setLayoutParams(layoutParams);
        frameLayout.addView(editText);
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(contextA);
        aVar.setTitle("Enter group ride code");
        aVar.setView(frameLayout);
        aVar.setNegativeButton(R.string.lbl_cancel, new c(7));
        aVar.setPositiveButton(R.string.lbl_ok, new ag0.d(14, contextA, editText));
        aVar.create().show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
