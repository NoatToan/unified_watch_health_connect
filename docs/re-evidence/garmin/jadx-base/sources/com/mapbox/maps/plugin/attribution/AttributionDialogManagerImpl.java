package com.mapbox.maps.plugin.attribution;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.geofencing.GeofencingError;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import d53.w;
import java.util.List;
import m.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010\u001e\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010(\u0012\u0004\b-\u0010\u000e\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010(\u0012\u0004\b1\u0010\u000e\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R*\u00102\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b2\u0010(\u0012\u0004\b5\u0010\u000e\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u0010\u000e¨\u0006?"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionDialogManagerImpl;", "Lcom/mapbox/maps/plugin/attribution/AttributionDialogManager;", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "attributions", "", "showAttributionDialog", "(Ljava/util/List;)V", "showTelemetryDialog", "()V", "showGeofencingConsentDialog", "", "attributionUrl", "showMapAttributionWebPage", "(Ljava/lang/String;)V", "url", "showWebPage", "Landroidx/appcompat/app/e$a;", "prepareDialogBuilder", "()Landroidx/appcompat/app/e$a;", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapAttributionDelegate", "showAttribution", "(Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;)V", "Landroid/content/DialogInterface;", "dialog", "", "which", "onClick", "(Landroid/content/DialogInterface;I)V", "onStop", "Landroid/content/Context;", "attributionList", "Ljava/util/List;", "Landroidx/appcompat/app/e;", "Landroidx/appcompat/app/e;", "getDialog$plugin_attribution_release", "()Landroidx/appcompat/app/e;", "setDialog$plugin_attribution_release", "(Landroidx/appcompat/app/e;)V", "getDialog$plugin_attribution_release$annotations", "telemetryDialog", "getTelemetryDialog$plugin_attribution_release", "setTelemetryDialog$plugin_attribution_release", "getTelemetryDialog$plugin_attribution_release$annotations", "geofencingDialog", "getGeofencingDialog$plugin_attribution_release", "setGeofencingDialog$plugin_attribution_release", "getGeofencingDialog$plugin_attribution_release$annotations", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "Lcom/mapbox/maps/module/MapTelemetry;", "telemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "geofencingConsent", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "getGeofencingConsent$annotations", "Companion", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionDialogManagerImpl implements AttributionDialogManager, DialogInterface.OnClickListener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String FEEDBACK_KEY_WORD = "feedback";
    private List<Attribution> attributionList;
    private final Context context;
    private e dialog;
    private MapGeofencingConsent geofencingConsent;
    private e geofencingDialog;
    private MapAttributionDelegate mapAttributionDelegate;
    private MapTelemetry telemetry;
    private e telemetryDialog;

    public AttributionDialogManagerImpl(Context context) {
        context.getClass();
        this.context = context;
    }

    public static /* synthetic */ void getDialog$plugin_attribution_release$annotations() {
    }

    private static /* synthetic */ void getGeofencingConsent$annotations() {
    }

    public static /* synthetic */ void getGeofencingDialog$plugin_attribution_release$annotations() {
    }

    public static /* synthetic */ void getTelemetryDialog$plugin_attribution_release$annotations() {
    }

    @SuppressLint({"PrivateResource"})
    private final e.a prepareDialogBuilder() {
        boolean zHasValue;
        TypedArray typedArrayObtainStyledAttributes = this.context.obtainStyledAttributes(R.styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes.getClass();
        try {
            zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar);
        } catch (Throwable unused) {
            zHasValue = false;
        }
        e.a aVar = zHasValue ? new e.a(this.context) : new e.a(new d(this.context, R.style.Theme_AppCompat_DayNight_Dialog_Alert));
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private final void showAttributionDialog(final List<Attribution> attributions) {
        e.a aVarPrepareDialogBuilder = prepareDialogBuilder();
        aVarPrepareDialogBuilder.setTitle(R.string.mapbox_attributionsDialogTitle);
        final Context context = this.context;
        final int i14 = R.layout.mapbox_attribution_list_item;
        aVarPrepareDialogBuilder.setAdapter(new ArrayAdapter<Attribution>(attributions, context, i14) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$showAttributionDialog$adapter$1
            final /* synthetic */ List<Attribution> $attributions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, i14, attributions);
                this.$attributions = attributions;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent) {
                parent.getClass();
                View view2 = super.getView(position, convertView, parent);
                view2.getClass();
                Attribution attribution = this.$attributions.get(position);
                TextView textView = (TextView) view2.findViewById(android.R.id.text1);
                textView.setTextColor(attribution.getUrl().length() == 0 ? -7829368 : a7.b.getColor(textView.getContext(), R.color.mapbox_blue));
                textView.setText(attribution.getTitle());
                return view2;
            }
        }, this);
        this.dialog = aVarPrepareDialogBuilder.show();
    }

    private final void showGeofencingConsentDialog() {
        e.a aVarPrepareDialogBuilder = prepareDialogBuilder();
        aVarPrepareDialogBuilder.setTitle(R.string.mapbox_attributionGeofencingTitle);
        aVarPrepareDialogBuilder.setMessage(R.string.mapbox_attributionGeofencingMessage);
        MapGeofencingConsent mapGeofencingConsent = this.geofencingConsent;
        boolean userConsent = mapGeofencingConsent != null ? mapGeofencingConsent.getUserConsent() : false;
        int i14 = userConsent ? R.string.mapbox_attributionGeofencingConsentedPositive : R.string.mapbox_attributionGeofencingRevokedPositive;
        int i15 = userConsent ? R.string.mapbox_attributionGeofencingConsentedNegative : R.string.mapbox_attributionGeofencingRevokedNegative;
        final p pVar = new p(24);
        final int i16 = 0;
        aVarPrepareDialogBuilder.setPositiveButton(i14, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributionDialogManagerImpl f54556b;

            {
                this.f54556b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                switch (i16) {
                    case 0:
                        AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$8(this.f54556b, pVar, dialogInterface, i17);
                        break;
                    default:
                        AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$9(this.f54556b, pVar, dialogInterface, i17);
                        break;
                }
            }
        });
        final int i17 = 1;
        aVarPrepareDialogBuilder.setNegativeButton(i15, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributionDialogManagerImpl f54556b;

            {
                this.f54556b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i18) {
                switch (i17) {
                    case 0:
                        AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$8(this.f54556b, pVar, dialogInterface, i18);
                        break;
                    default:
                        AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$9(this.f54556b, pVar, dialogInterface, i18);
                        break;
                }
            }
        });
        this.geofencingDialog = aVarPrepareDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGeofencingConsentDialog$lambda$7(Expected expected) {
        expected.getClass();
        GeofencingError geofencingError = (GeofencingError) expected.getError();
        if (geofencingError != null) {
            MapboxLogger.logW("GeofencingConsent", "Unable to set user consent: " + geofencingError.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGeofencingConsentDialog$lambda$8(AttributionDialogManagerImpl attributionDialogManagerImpl, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback, DialogInterface dialogInterface, int i14) {
        attributionDialogManagerImpl.getClass();
        geofencingUtilsUserConsentResponseCallback.getClass();
        MapGeofencingConsent mapGeofencingConsent = attributionDialogManagerImpl.geofencingConsent;
        if (mapGeofencingConsent != null) {
            mapGeofencingConsent.setUserConsent(true, geofencingUtilsUserConsentResponseCallback);
        }
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGeofencingConsentDialog$lambda$9(AttributionDialogManagerImpl attributionDialogManagerImpl, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback, DialogInterface dialogInterface, int i14) {
        attributionDialogManagerImpl.getClass();
        geofencingUtilsUserConsentResponseCallback.getClass();
        MapGeofencingConsent mapGeofencingConsent = attributionDialogManagerImpl.geofencingConsent;
        if (mapGeofencingConsent != null) {
            mapGeofencingConsent.setUserConsent(false, geofencingUtilsUserConsentResponseCallback);
        }
        dialogInterface.cancel();
    }

    private final void showMapAttributionWebPage(String attributionUrl) {
        MapAttributionDelegate mapAttributionDelegate = this.mapAttributionDelegate;
        if (mapAttributionDelegate != null && w.z(attributionUrl, FEEDBACK_KEY_WORD, false)) {
            attributionUrl = mapAttributionDelegate.buildMapBoxFeedbackUrl(this.context);
        }
        if (attributionUrl.length() > 0) {
            showWebPage(attributionUrl);
        }
    }

    private final void showTelemetryDialog() {
        e.a aVarPrepareDialogBuilder = prepareDialogBuilder();
        aVarPrepareDialogBuilder.setTitle(R.string.mapbox_attributionTelemetryTitle);
        aVarPrepareDialogBuilder.setMessage(R.string.mapbox_attributionTelemetryMessage);
        final int i14 = 0;
        aVarPrepareDialogBuilder.setPositiveButton(R.string.mapbox_attributionTelemetryPositive, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributionDialogManagerImpl f54554b;

            {
                this.f54554b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$3(this.f54554b, dialogInterface, i15);
                        break;
                    case 1:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$4(this.f54554b, dialogInterface, i15);
                        break;
                    default:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$5(this.f54554b, dialogInterface, i15);
                        break;
                }
            }
        });
        final int i15 = 1;
        aVarPrepareDialogBuilder.setNeutralButton(R.string.mapbox_attributionTelemetryNeutral, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributionDialogManagerImpl f54554b;

            {
                this.f54554b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$3(this.f54554b, dialogInterface, i16);
                        break;
                    case 1:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$4(this.f54554b, dialogInterface, i16);
                        break;
                    default:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$5(this.f54554b, dialogInterface, i16);
                        break;
                }
            }
        });
        final int i16 = 2;
        aVarPrepareDialogBuilder.setNegativeButton(R.string.mapbox_attributionTelemetryNegative, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AttributionDialogManagerImpl f54554b;

            {
                this.f54554b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                switch (i16) {
                    case 0:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$3(this.f54554b, dialogInterface, i17);
                        break;
                    case 1:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$4(this.f54554b, dialogInterface, i17);
                        break;
                    default:
                        AttributionDialogManagerImpl.showTelemetryDialog$lambda$5(this.f54554b, dialogInterface, i17);
                        break;
                }
            }
        });
        this.telemetryDialog = aVarPrepareDialogBuilder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTelemetryDialog$lambda$3(AttributionDialogManagerImpl attributionDialogManagerImpl, DialogInterface dialogInterface, int i14) {
        attributionDialogManagerImpl.getClass();
        MapTelemetry mapTelemetry = attributionDialogManagerImpl.telemetry;
        if (mapTelemetry != null) {
            mapTelemetry.setUserTelemetryRequestState(true);
        }
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTelemetryDialog$lambda$4(AttributionDialogManagerImpl attributionDialogManagerImpl, DialogInterface dialogInterface, int i14) {
        attributionDialogManagerImpl.getClass();
        String string = attributionDialogManagerImpl.context.getResources().getString(R.string.mapbox_telemetryLink);
        string.getClass();
        attributionDialogManagerImpl.showWebPage(string);
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTelemetryDialog$lambda$5(AttributionDialogManagerImpl attributionDialogManagerImpl, DialogInterface dialogInterface, int i14) {
        attributionDialogManagerImpl.getClass();
        MapTelemetry mapTelemetry = attributionDialogManagerImpl.telemetry;
        if (mapTelemetry != null) {
            mapTelemetry.setUserTelemetryRequestState(false);
        }
        dialogInterface.cancel();
    }

    private final void showWebPage(String url) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.context, R.string.mapbox_attributionErrorNoBrowser, 1).show();
        } catch (Throwable th3) {
            Toast.makeText(this.context, th3.getLocalizedMessage(), 1).show();
        }
    }

    /* JADX INFO: renamed from: getDialog$plugin_attribution_release, reason: from getter */
    public final e getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: getGeofencingDialog$plugin_attribution_release, reason: from getter */
    public final e getGeofencingDialog() {
        return this.geofencingDialog;
    }

    /* JADX INFO: renamed from: getTelemetryDialog$plugin_attribution_release, reason: from getter */
    public final e getTelemetryDialog() {
        return this.telemetryDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        dialog.getClass();
        List<Attribution> list = this.attributionList;
        if (list == null) {
            s.m("attributionList");
            throw null;
        }
        Attribution attribution = list.get(which);
        String url = attribution.getUrl();
        if (s.g(url, Attribution.ABOUT_TELEMETRY_URL)) {
            showTelemetryDialog();
        } else if (s.g(url, Attribution.GEOFENCING_URL_MARKER)) {
            showGeofencingConsentDialog();
        } else {
            showMapAttributionWebPage(attribution.getUrl());
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionDialogManager
    public void onStop() {
        e eVar = this.dialog;
        if (eVar != null) {
            if (!eVar.isShowing()) {
                eVar = null;
            }
            if (eVar != null) {
                eVar.dismiss();
            }
        }
        e eVar2 = this.telemetryDialog;
        if (eVar2 != null) {
            if (!eVar2.isShowing()) {
                eVar2 = null;
            }
            if (eVar2 != null) {
                eVar2.dismiss();
            }
        }
        e eVar3 = this.geofencingDialog;
        if (eVar3 != null) {
            e eVar4 = eVar3.isShowing() ? eVar3 : null;
            if (eVar4 != null) {
                eVar4.dismiss();
            }
        }
    }

    public final void setDialog$plugin_attribution_release(e eVar) {
        this.dialog = eVar;
    }

    public final void setGeofencingDialog$plugin_attribution_release(e eVar) {
        this.geofencingDialog = eVar;
    }

    public final void setTelemetryDialog$plugin_attribution_release(e eVar) {
        this.telemetryDialog = eVar;
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionDialogManager
    public void showAttribution(MapAttributionDelegate mapAttributionDelegate) {
        mapAttributionDelegate.getClass();
        this.mapAttributionDelegate = mapAttributionDelegate;
        this.telemetry = mapAttributionDelegate.telemetry();
        MapGeofencingConsent mapGeofencingConsentGeofencingConsent = mapAttributionDelegate.geofencingConsent();
        this.geofencingConsent = mapGeofencingConsentGeofencingConsent;
        this.attributionList = mapAttributionDelegate.parseAttributions(this.context, new AttributionParserConfig(false, false, false, false, false, mapGeofencingConsentGeofencingConsent != null ? mapGeofencingConsentGeofencingConsent.shouldShowConsent() : false, 31, null));
        Context context = this.context;
        if (context instanceof Activity ? ((Activity) context).isFinishing() : false) {
            return;
        }
        List<Attribution> list = this.attributionList;
        if (list != null) {
            showAttributionDialog(list);
        } else {
            s.m("attributionList");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionDialogManagerImpl$Companion;", "", "()V", "FEEDBACK_KEY_WORD", "", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
