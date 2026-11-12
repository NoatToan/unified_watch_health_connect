package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.watch.companion.R;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.weather.WeatherManager;
import com.huami.watch.companion.weather.bean.WeatherCity;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.util.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/* JADX INFO: loaded from: classes16.dex */
public abstract class WeatherBaseActivity extends BaseActivity {
    private AlertDialogFragment b;

    public class a implements Observer<Boolean> {
        public final /* synthetic */ Location a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ TextView c;

        public a(Location location, Context context, TextView textView) {
            this.a = location;
            this.b = context;
            this.c = textView;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            if (!bool.booleanValue() || this.a.getAddress() == null) {
                return;
            }
            WeatherBaseActivity.this.refreshCurrentWeatherCityLbs(this.b, this.c, this.a.getAddress().toStringShort());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public class b implements ObservableOnSubscribe<Boolean> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Location b;

        public b(Context context, Location location) {
            this.a = context;
            this.b = location;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
            WeatherCity weatherCityRequestWeatherV3City = WeatherManager.getManager(this.a).requestWeatherV3City(this.a, this.b);
            if (weatherCityRequestWeatherV3City == null || TextUtils.isEmpty(weatherCityRequestWeatherV3City.getLocationKey())) {
                return;
            }
            observableEmitter.onNext(Boolean.TRUE);
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherBaseActivity.this.dismissLBSPermissionTipDialog();
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, this.a.getPackageName(), null));
            this.a.startActivity(intent);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherBaseActivity.this.dismissLBSPermissionTipDialog();
        }
    }

    private void c(Context context, TextView textView, @NonNull Location location) {
        Observable.create(new b(context, location)).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new a(location, context, textView));
    }

    public void dismissLBSPermissionTipDialog() {
        AlertDialogFragment alertDialogFragment = this.b;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
            this.b = null;
        }
    }

    public abstract void onRefreshCurrentWeatherCity(TextView textView, @NonNull WeatherCity weatherCity, boolean z);

    public abstract boolean refreshCurrentWeatherCity(Context context, TextView textView);

    public boolean refreshCurrentWeatherCityLbs(Context context, TextView textView) {
        return refreshCurrentWeatherCityLbs(context, textView, WeatherManager.getManager(context).getLastLocation());
    }

    public void showLBSPermissionTipDialog(Activity activity) {
        synchronized (this) {
            if (this.b != null) {
                return;
            }
            AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
            this.b = alertDialogFragmentNewInstance;
            alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.weather_no_permission));
            this.b.setConfirm(activity.getString(R.string.btn_set), new c(activity));
            this.b.setCancel(activity.getString(R.string.btn_cancel), new d());
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(this.b, "LBSNoPermission");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public abstract String tag();

    public boolean refreshCurrentWeatherCityLbs(Context context, TextView textView, String str) {
        WeatherCity lastLocatedCity = WeatherManager.getManager(context).getLastLocatedCity(str);
        Log.d(tag(), "Refresh Last Located WeatherCity : " + str + ", " + lastLocatedCity, new Object[0]);
        if (lastLocatedCity == null) {
            return false;
        }
        onRefreshCurrentWeatherCity(textView, lastLocatedCity, true);
        return true;
    }

    public void refreshCurrentWeatherCityLbs(Context context, TextView textView, @NonNull Location location) {
        if (location.getAddress() != null ? refreshCurrentWeatherCityLbs(context, textView, location.getAddress().toStringShort()) : false) {
            return;
        }
        c(context, textView, location);
    }
}
