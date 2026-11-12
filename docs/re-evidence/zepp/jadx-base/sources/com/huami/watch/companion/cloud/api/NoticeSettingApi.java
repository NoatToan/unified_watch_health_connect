package com.huami.watch.companion.cloud.api;

import android.content.Context;
import com.huami.watch.companion.cloud.api.NoticeSettingApi;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class NoticeSettingApi {
    private static final String a = "Cloud-API-NoticeSettingApi";

    public interface NoticeStatusListener<T> {
        void onNoticeStatusChange(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Context context, boolean z, ObservableEmitter observableEmitter) throws Exception {
        boolean zPostUserSetting = UserSettingsAPI.postUserSetting(context, UserSettingsKeys.LVMI_NOTICE_KEY, String.valueOf(z));
        observableEmitter.onNext(Boolean.valueOf(zPostUserSetting));
        Log.e(a, "setNoticeEnable:" + z + ", result:" + zPostUserSetting, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(boolean z, NoticeStatusListener noticeStatusListener, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            Box.get().put(UserSettingsKeys.LVMI_NOTICE_KEY, z);
        }
        if (noticeStatusListener != null) {
            noticeStatusListener.onNoticeStatusChange(bool);
        }
    }

    public static void setNoticeEnable(final Context context, final boolean z, final NoticeStatusListener<Boolean> noticeStatusListener) {
        Rx.io(new ObservableOnSubscribe() { // from class: uf5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                NoticeSettingApi.c(context, z, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: vf5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                NoticeSettingApi.d(z, noticeStatusListener, (Boolean) obj);
            }
        });
    }
}
