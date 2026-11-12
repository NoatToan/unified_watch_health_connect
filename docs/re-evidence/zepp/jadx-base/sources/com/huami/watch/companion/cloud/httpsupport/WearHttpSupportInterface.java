package com.huami.watch.companion.cloud.httpsupport;

import android.content.Context;
import androidx.annotation.NonNull;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.Token;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.account.Account;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.global.PublicParamsBuilder;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.transporter.http.URLCompleter;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import com.squareup.okhttp.Request;
import defpackage.s03;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public class WearHttpSupportInterface {
    private static final String a = "com.huami.watch";
    private static final TaskManager b = new TaskManager("check-token");
    private static final Object c = new Object();

    public class a extends Task {
        public final /* synthetic */ Context f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, Context context) {
            super(runningStatus);
            this.f = context;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            Token token;
            synchronized (WearHttpSupportInterface.c) {
                token = AccountManager.getDefault(this.f).getToken();
            }
            if (token == null) {
                return null;
            }
            WearHttpCompanion.getInstance().manageCurrUserId(this.f, token.getUid());
            return null;
        }
    }

    public class b extends PublicParamsBuilder {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.huami.watch.transport.httpsupport.global.PublicParamsBuilder
        public synchronized String completeURL(Context context, String str) {
            Token token;
            token = null;
            try {
                synchronized (WearHttpSupportInterface.c) {
                    token = AccountManager.getDefault(context).getToken();
                }
            } catch (Exception e) {
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "...   >>t is NULL!", e);
                }
            }
            if (token == null) {
                token = new Token();
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "注意 ===>>> t is null Ignore URL Complete...", new Object[0]);
                }
            }
            return URLCompleter.fillWithTokenRelated(URLCompleter.fillWithTokenRelated(URLCompleter.fillWithTokenRelated(str, URLCompleter.URLSeat.USER_ID, token.getUid()), URLCompleter.URLSeat.PROVIDER, token.getProvider()), URLCompleter.URLSeat.TOKEN, token.getAccessToken());
        }

        @Override // com.huami.watch.transport.httpsupport.global.PublicParamsBuilder
        public synchronized void fillPublicHeader(Context context, DataItem dataItem, Request.Builder builder) {
            WearHttpSupportInterface.c(context, dataItem, builder);
        }

        @Override // com.huami.watch.transport.httpsupport.global.PublicParamsBuilder
        public String getUserId() {
            Token token;
            try {
                synchronized (WearHttpSupportInterface.c) {
                    token = AccountManager.getDefault(this.a).getToken();
                }
                String uid = token.getUid();
                Log.i("HttpSupport", "PublicParamsBuilder-getUid:" + uid, new Object[0]);
                return uid;
            } catch (Exception e) {
                e.printStackTrace();
                return super.getUserId();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, DataItem dataItem, Request.Builder builder) {
        builder.addHeader(PublicParamsBuilder.HEAD_APP_NAME, a);
        String accessToken = "";
        try {
            synchronized (c) {
                Token token = AccountManager.getDefault(context).getToken();
                if (token != null) {
                    accessToken = token.getAccessToken();
                    if (GlobalDefine.DEBUG_COMPANION) {
                        Log.i(GlobalDefine.TAG_COMPANION, "t---> : " + token, new Object[0]);
                    }
                } else if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "t is NULL...!", new Object[0]);
                }
            }
        } catch (Exception e) {
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, "... token is NULL!", e);
            }
        }
        if (accessToken != null) {
            builder.addHeader(PublicParamsBuilder.HEADER_APP_TOKERN, accessToken);
        }
        builder.addHeader(PublicParamsBuilder.HEADER_CALLID, String.valueOf(System.currentTimeMillis() / 1000));
        builder.addHeader(PublicParamsBuilder.HEADER_COUNTRY, String.valueOf(I18nUtil.getLocaleCountry(context)));
        builder.addHeader(PublicParamsBuilder.HEADER_TIMEZONE, String.valueOf(TimeZone.getDefault().getID()));
        builder.addHeader(PublicParamsBuilder.HEADER_CHANNEL, AppUtil.getMetaDataChannel(context));
        builder.addHeader(PublicParamsBuilder.HEADER_PLATFORM, "android_phone");
        builder.addHeader(PublicParamsBuilder.HEADER_APP_VER, String.valueOf(AppUtil.getVersionCode(context)));
        builder.addHeader(PublicParamsBuilder.HEADER_PROTO_VER, "1.0");
        builder.addHeader(PublicParamsBuilder.HEADER_LOCALE, I18nUtil.getLocaleStr(context));
    }

    private static PublicParamsBuilder d(Context context) {
        return new b(context);
    }

    public static void doInit(@NonNull Context context) {
        try {
            WearHttpCompanion.init(context);
        } catch (Exception e) {
            HMLog.error("WearHttpSupportInterface", new s03(e));
        }
        b.next(new a(Task.RunningStatus.WORK_THREAD, context)).execute();
        WearHttpCompanion.getInstance().setPublicParamsBuilder(d(context));
    }

    public static synchronized void kickToSync(Context context) {
        GlobalDataSyncKicker.getInstance().kick(context, 125);
    }

    public static synchronized void startNewSyncAndMonitor(Context context, ProcessStateMonitor.Jack jack) {
        GlobalDefine.setIsOversea(Account.isOversea(context));
        GlobalDataSyncKicker.getInstance().kick(context, jack, true);
    }
}
