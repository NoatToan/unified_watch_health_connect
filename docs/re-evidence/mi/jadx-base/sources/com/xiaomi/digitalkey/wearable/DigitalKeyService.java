package com.xiaomi.digitalkey.wearable;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback;
import com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework;
import com.xiaomi.digitalkey.wearable.keyshare.KeyShareFriend;
import com.xiaomi.digitalkey.wearable.keytracking.KtsShared;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.EnvironmentConfig;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import java.io.IOException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes7.dex */
public class DigitalKeyService extends Service {
    private static final boolean DEBUG = Logger.LOG_SERVICE;
    public static final int DIGITAL_KEY_INSUFFICIENT_SE_SPACE = 22050;
    public static final int DIGITAL_KEY_INVALID_PARAMETER = 22003;
    public static final int DIGITAL_KEY_MAILBOX_NOT_READY = 22022;
    public static final int DIGITAL_KEY_QUERY_DELETED_MAILBOX = 22014;
    public static final int DIGITAL_KEY_QUERY_MAILBOX_IO_ERROR = 22011;
    public static final int DIGITAL_KEY_QUERY_OCCUPIED_MAILBOX = 22012;
    public static final int DIGITAL_KEY_QUERY_SELF_OCCUPIED_MAILBOX = 22013;
    public static final int DIGITAL_KEY_SHARE_FAIL = 22020;
    public static final int DIGITAL_KEY_SHARE_RETRY = 22021;
    public static final int DIGITAL_KEY_SHARE_TRACK_RETRY = 22019;
    public static final int DIGITAL_KEY_TSM_CLIENT_NOT_READY = 21126;
    public static final int DIGITAL_KEY_UPDATE_DELETED_MAILBOX = 22018;
    public static final int DIGITAL_KEY_UPDATE_MAILBOX_IO_ERROR = 22015;
    public static final int DIGITAL_KEY_UPDATE_OCCUPIED_MAILBOX = 22017;
    public static final int DIGITAL_KEY_UPDATE_WRONG_NET_PARAM = 22016;
    public static final int DIGITAL_KEY_WRONG_DATA_FORMAT = 21128;
    public static final int DIGITAL_KEY_WRONG_RSP_FROM_SERVER = 21129;
    private static final String LogTag = "SDK-DKF-DigitalKeyService";
    static DeviceConf mDevConf;
    static TSMProxy mTsmProxy;
    DKFrameworkService mDKFService;

    public final class DKFrameworkService extends IDigitalKeyFramework.Stub {
        public DKFrameworkService() {
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void confirmDigitalKeySharing(Uri uri, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
            int i;
            int i2;
            if (DigitalKeyService.mTsmProxy == null) {
                i = DigitalKeyService.DIGITAL_KEY_TSM_CLIENT_NOT_READY;
            } else if (uri == null) {
                i = 22003;
            } else {
                KeyShareFriend keyShareFriend = new KeyShareFriend(DigitalKeyService.this.getApplicationContext(), uri.toString());
                try {
                    if (keyShareFriend.getInviteDigitalKeyInformation() == null) {
                        iDigitalKeyCallback.onError(21129);
                        return;
                    }
                    try {
                        keyShareFriend.continueCreateDigitalKey();
                        Bundle bundle = new Bundle();
                        bundle.putInt("type", 4);
                        iDigitalKeyCallback.onResult(bundle);
                        return;
                    } catch (KeyShareFriend.DigitalKeyInsufficientSpaceException unused) {
                        i2 = DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE;
                        iDigitalKeyCallback.onError(i2);
                        return;
                    } catch (KeyShareFriend.KeyShareCreateFailException e) {
                        iDigitalKeyCallback.onError(22021);
                        e.printStackTrace();
                        return;
                    } catch (KeyShareFriend.KeyShareException e2) {
                        iDigitalKeyCallback.onError(21129);
                        e2.printStackTrace();
                        return;
                    } catch (KeyShareFriend.KeyShareIOErrorException unused2) {
                        i2 = 22015;
                        iDigitalKeyCallback.onError(i2);
                        return;
                    } catch (KeyShareFriend.KeyShareUpdateDeletedMailboxException unused3) {
                        i2 = 22018;
                        iDigitalKeyCallback.onError(i2);
                        return;
                    } catch (KeyShareFriend.KeyShareUpdateOccupiedMailboxException unused4) {
                        i2 = 22017;
                        iDigitalKeyCallback.onError(i2);
                        return;
                    } catch (KeyShareFriend.KeyShareUpdateWrongDataException unused5) {
                        i2 = 22016;
                        iDigitalKeyCallback.onError(i2);
                        return;
                    }
                } catch (KeyShareFriend.KeyShareIOErrorException unused6) {
                    i = 22011;
                } catch (KeyShareFriend.KeyShareQueryDeletedMailboxException unused7) {
                    i = 22014;
                } catch (KeyShareFriend.KeyShareQueryOccupiedMailboxException unused8) {
                    i = 22012;
                } catch (KeyShareFriend.KeyShareQuerySelfOccupiedMailboxException unused9) {
                    i = 22013;
                } catch (KeyShareFriend.RetryException unused10) {
                    iDigitalKeyCallback.onError(22021);
                    return;
                } catch (InvalidKeyException e3) {
                    e3.printStackTrace();
                    i = 21128;
                }
            }
            iDigitalKeyCallback.onError(i);
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void queryImportRequest(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
            int i;
            int i2;
            if (TextUtils.isEmpty(str)) {
                i2 = 22003;
            } else {
                KeyShareFriend keyShareFriendHandlePushData = KeyShareFriend.handlePushData(DigitalKeyService.this.getApplicationContext(), str);
                if (keyShareFriendHandlePushData != null) {
                    try {
                        if (keyShareFriendHandlePushData.queryImportRequest()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("type", 4);
                            iDigitalKeyCallback.onResult(bundle);
                        } else {
                            iDigitalKeyCallback.onError(22020);
                        }
                        return;
                    } catch (KeyShareFriend.KeyShareIOErrorException | KeyShareFriend.MailboxNotReadyException unused) {
                        i = 22022;
                        iDigitalKeyCallback.onError(i);
                        return;
                    } catch (KeyShareFriend.KeyShareQueryDeletedMailboxException unused2) {
                        i = 22014;
                        iDigitalKeyCallback.onError(i);
                        return;
                    }
                }
                i2 = 21128;
            }
            iDigitalKeyCallback.onError(i2);
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void startRedeemSharing(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
            int i;
            int i2;
            if (DigitalKeyService.mTsmProxy == null) {
                i2 = DigitalKeyService.DIGITAL_KEY_TSM_CLIENT_NOT_READY;
            } else if (TextUtils.isEmpty(str)) {
                i2 = 22003;
            } else {
                KeyShareFriend keyShareFriendHandlePushData = KeyShareFriend.handlePushData(DigitalKeyService.this.getApplicationContext(), str);
                if (keyShareFriendHandlePushData != null) {
                    try {
                        if (keyShareFriendHandlePushData.continueImportDigitalKey()) {
                            Bundle bundle = new Bundle();
                            bundle.putString(IDigitalKeyCallback.EXTRA_STR, ByteUtils.toHexString(keyShareFriendHandlePushData.getKeyId()));
                            iDigitalKeyCallback.onResult(bundle);
                        } else {
                            iDigitalKeyCallback.onError(22020);
                        }
                        return;
                    } catch (KeyShareFriend.KeyShareIOErrorException | KeyShareFriend.RetryException | IOException unused) {
                        i = 22021;
                        iDigitalKeyCallback.onError(i);
                        return;
                    } catch (KeyShareFriend.KeyShareQueryDeletedMailboxException unused2) {
                        i = 22014;
                        iDigitalKeyCallback.onError(i);
                        return;
                    } catch (KeyShareFriend.KeyShareQueryOccupiedMailboxException unused3) {
                        i = 22012;
                        iDigitalKeyCallback.onError(i);
                        return;
                    } catch (KeyShareFriend.MailboxNotReadyException unused4) {
                        i = 22022;
                        iDigitalKeyCallback.onError(i);
                        return;
                    } catch (KtsShared.RetryKTSException unused5) {
                        i = 22019;
                        iDigitalKeyCallback.onError(i);
                        return;
                    }
                }
                i2 = 21128;
            }
            iDigitalKeyCallback.onError(i2);
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void terminateDigitalKey(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
            int i;
            if (DigitalKeyService.mTsmProxy == null) {
                i = DigitalKeyService.DIGITAL_KEY_TSM_CLIENT_NOT_READY;
            } else {
                if (ByteUtils.equals(DigitalKeyService.mTsmProxy.KTS_terminate(ByteUtils.fromHexString(str)), ConstUtils.SW_OK)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 4);
                    iDigitalKeyCallback.onResult(bundle);
                    EPConfig.removeLongTermConf(DigitalKeyService.this.getApplicationContext(), ByteUtils.fromHexString(str));
                    return;
                }
                i = 21129;
            }
            iDigitalKeyCallback.onError(i);
        }
    }

    public DigitalKeyService() {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("DK Msg start!");
            sb.append(Build.PRODUCT);
        }
    }

    public void initDKF(Context context) {
        EnvironmentConfig.setContext(context);
        mTsmProxy = TSMProxy.getInstance(context);
        mDevConf = DeviceConf.getInstance();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.mDKFService == null) {
            this.mDKFService = new DKFrameworkService();
        }
        return this.mDKFService.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        initDKF(getApplicationContext());
    }

    public DigitalKeyService(Application application) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("DK Msg start from application!");
            sb.append(Build.PRODUCT);
        }
    }
}
