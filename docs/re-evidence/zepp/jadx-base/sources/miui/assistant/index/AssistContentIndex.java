package miui.assistant.index;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import miui.assistant.assist.AssistContent;

/* JADX INFO: loaded from: classes23.dex */
public class AssistContentIndex implements IAssistContentIndex {
    private static final String CONTENT = "content";
    private static final String GROUP = "group_id";
    private static final String LICENCE_FILE = "licence.conf";
    private static final String PACKAGE = "package";
    private static final String SERVICE_ACTION = "com.miui.personalassistant.trans";
    private static final String SERVICE_PACKAGE_NAME = "com.miui.personalassistant";
    private static final String SIGN = "signature";
    private static final int STAMPLENGTH = 13;
    private static final String TAG = "AssistContentIndex";
    private static final String TESTSTR = "1";
    private static final String TIMESTAMP = "timestamp";
    private static final String UNIQUE = "unique_id";
    private static IAssistContentIndex sIndex;
    private String mContent;
    private IDataTransmissionService mDataTransmissionService;
    private boolean mServiceBinded = false;
    private DataServiceConnection mServiceConnection;
    private String mSign;
    private String mSign1;
    private long mTimestamp;
    private long mTimestamp1;

    private AssistContentIndex() {
    }

    private boolean bindService(Context context, boolean z, String str, IndexCallback indexCallback) {
        if (context == null) {
            return false;
        }
        DataServiceConnection dataServiceConnection = this.mServiceConnection;
        if (dataServiceConnection == null) {
            this.mServiceConnection = new DataServiceConnection(context, z, str, indexCallback);
            getConfig(context);
            if (TextUtils.isEmpty(this.mSign) || TextUtils.isEmpty(this.mContent)) {
                return false;
            }
            Intent intent = new Intent(SERVICE_ACTION);
            intent.setPackage(SERVICE_PACKAGE_NAME);
            intent.putExtra("package", context.getPackageName());
            intent.putExtra("signature", this.mSign);
            intent.putExtra("content", this.mContent);
            intent.putExtra("timestamp", this.mTimestamp);
            intent.putExtra("signature1", this.mSign1);
            intent.putExtra("timestamp1", this.mTimestamp1);
            try {
                if (!context.bindService(intent, this.mServiceConnection, 1)) {
                    Log.d(TAG, "Can't bind service");
                }
            } catch (SecurityException e) {
                Log.e(TAG, "SecurityException:" + e);
            }
        } else {
            dataServiceConnection.addUniqueId(str);
        }
        return this.mServiceBinded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void delData(Context context, boolean z, List<String> list, IndexCallback indexCallback) {
        try {
            try {
                String packageName = context.getPackageName();
                if (z) {
                    IDataTransmissionService iDataTransmissionService = this.mDataTransmissionService;
                    if (iDataTransmissionService != null) {
                        iDataTransmissionService.delAllAssistData(packageName);
                    }
                } else {
                    for (String str : list) {
                        IDataTransmissionService iDataTransmissionService2 = this.mDataTransmissionService;
                        if (iDataTransmissionService2 != null) {
                            iDataTransmissionService2.delAssistData(packageName, str);
                        }
                    }
                }
                if (indexCallback != null) {
                    indexCallback.onIndexed(new IndexStatus(0));
                }
                unbindService(context);
            } catch (RemoteException e) {
                Log.e(TAG, "RemoteException:" + e);
                if (indexCallback != null) {
                    indexCallback.onIndexed(new IndexStatus(100));
                }
                unbindService(context);
            } catch (SecurityException e2) {
                Log.e(TAG, "SecurityException:" + e2);
                unbindService(context);
            }
            this.mServiceBinded = false;
        } catch (Throwable th) {
            unbindService(context);
            this.mServiceBinded = false;
            throw th;
        }
    }

    private void getConfig(Context context) {
        try {
            this.mTimestamp = 0L;
            String fileStr = AppInfoUtil.getFileStr(context, LICENCE_FILE);
            if (fileStr.length() > 13) {
                int length = fileStr.length() - 13;
                this.mSign = fileStr.substring(0, length);
                this.mTimestamp = Long.valueOf(fileStr.substring(length)).longValue();
            }
            this.mContent = AppInfoUtil.getContent(context);
            this.mTimestamp1 = 0L;
            String fileStr2 = AppInfoUtil.getFileStr(context, "licence.conf1");
            if (fileStr2.length() > 13) {
                int length2 = fileStr2.length() - 13;
                this.mSign1 = fileStr2.substring(0, length2);
                this.mTimestamp1 = Long.valueOf(fileStr2.substring(length2)).longValue();
            }
        } catch (Exception e) {
            Log.e(TAG, "config exception:" + e);
        }
    }

    public static synchronized IAssistContentIndex getDefaultIndex() {
        if (sIndex == null) {
            sIndex = new AssistContentIndex();
        }
        return sIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void reportData(Context context, List<AssistContentItem> list, IndexCallback indexCallback) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    try {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            for (AssistContentItem assistContentItem : list) {
                                assistContentItem.setExpirationTime(String.valueOf(assistContentItem.getDueTime() + jCurrentTimeMillis));
                                AssistContent assistContentConvertToAssistContent = AssistContentItem.convertToAssistContent(assistContentItem);
                                assistContentConvertToAssistContent.getExtras().putString(UNIQUE, assistContentItem.getUniqueId());
                                assistContentConvertToAssistContent.getExtras().putString("group_id", assistContentItem.getGroupId());
                                assistContentConvertToAssistContent.getExtras().putString("package", context.getPackageName());
                                assistContentConvertToAssistContent.getExtras().putLong("timestamp", jCurrentTimeMillis);
                                IDataTransmissionService iDataTransmissionService = this.mDataTransmissionService;
                                if (iDataTransmissionService != null) {
                                    iDataTransmissionService.reportAssistData(assistContentConvertToAssistContent);
                                }
                            }
                            if (indexCallback != null) {
                                indexCallback.onIndexed(new IndexStatus(0));
                            }
                            unbindService(context);
                        } catch (Throwable th) {
                            unbindService(context);
                            this.mServiceBinded = false;
                            throw th;
                        }
                    } catch (RemoteException e) {
                        Log.e(TAG, "RemoteException:" + e);
                        if (indexCallback != null) {
                            indexCallback.onIndexed(new IndexStatus(100));
                        }
                        unbindService(context);
                    } catch (SecurityException e2) {
                        Log.e(TAG, "SecurityException:" + e2);
                        unbindService(context);
                    }
                    this.mServiceBinded = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unbindService(Context context) {
        DataServiceConnection dataServiceConnection;
        if (context == null || (dataServiceConnection = this.mServiceConnection) == null) {
            return;
        }
        context.unbindService(dataServiceConnection);
        this.mServiceConnection = null;
    }

    @Override // miui.assistant.index.IAssistContentIndex
    public synchronized void batchIndexItems(Context context, List<AssistContentItem> list, IndexCallback indexCallback) {
        if (list != null) {
            if (!list.isEmpty()) {
                bindService(context, list, indexCallback);
            }
        }
    }

    @Override // miui.assistant.index.IAssistContentIndex
    public synchronized void deleteAllIndexItems(Context context, IndexCallback indexCallback) {
        bindService(context, true, null, indexCallback);
    }

    @Override // miui.assistant.index.IAssistContentIndex
    public synchronized void deleteIndexItem(Context context, String str, IndexCallback indexCallback) {
        if (str != null) {
            if (!str.isEmpty()) {
                bindService(context, false, str, indexCallback);
            }
        }
    }

    @Override // miui.assistant.index.IAssistContentIndex
    public synchronized void indexItem(Context context, AssistContentItem assistContentItem, IndexCallback indexCallback) {
        if (assistContentItem == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(assistContentItem);
        batchIndexItems(context, arrayList, indexCallback);
    }

    public class DataServiceConnection implements ServiceConnection {
        private IndexCallback mCallback;
        private Context mContext;
        public boolean mIsAdd;
        public boolean mIsDelAll;
        private List<AssistContentItem> mItems;
        private List<String> mUniqueIds;

        public DataServiceConnection(Context context, List<AssistContentItem> list, IndexCallback indexCallback) {
            this.mUniqueIds = new ArrayList();
            ArrayList arrayList = new ArrayList();
            this.mItems = arrayList;
            this.mContext = context;
            arrayList.addAll(list);
            this.mCallback = indexCallback;
            this.mIsAdd = true;
        }

        public void addItems(List<AssistContentItem> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.mItems.addAll(list);
        }

        public void addUniqueId(String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            this.mUniqueIds.add(str);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(AssistContentIndex.TAG, "connected service " + iBinder);
            AssistContentIndex.this.mDataTransmissionService = IDataTransmissionService.Stub.asInterface(iBinder);
            AssistContentIndex.this.mServiceBinded = true;
            if (this.mIsAdd) {
                AssistContentIndex.this.reportData(this.mContext, this.mItems, this.mCallback);
            } else {
                AssistContentIndex.this.delData(this.mContext, this.mIsDelAll, this.mUniqueIds, this.mCallback);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(AssistContentIndex.TAG, "onServiceDisconnected " + componentName);
            AssistContentIndex.this.mServiceBinded = false;
            AssistContentIndex.this.unbindService(this.mContext);
        }

        public DataServiceConnection(Context context, boolean z, String str, IndexCallback indexCallback) {
            this.mUniqueIds = new ArrayList();
            this.mItems = new ArrayList();
            this.mContext = context;
            this.mCallback = indexCallback;
            this.mIsAdd = false;
            this.mIsDelAll = z;
            if (z || str == null || str.isEmpty()) {
                return;
            }
            this.mUniqueIds.add(str);
        }
    }

    private boolean bindService(Context context, List<AssistContentItem> list, IndexCallback indexCallback) {
        if (context == null) {
            return false;
        }
        DataServiceConnection dataServiceConnection = this.mServiceConnection;
        if (dataServiceConnection == null) {
            this.mServiceConnection = new DataServiceConnection(context, list, indexCallback);
            getConfig(context);
            if (TextUtils.isEmpty(this.mSign) || TextUtils.isEmpty(this.mContent)) {
                return false;
            }
            Intent intent = new Intent(SERVICE_ACTION);
            intent.setPackage(SERVICE_PACKAGE_NAME);
            intent.putExtra("package", context.getPackageName());
            intent.putExtra("signature", this.mSign);
            intent.putExtra("content", this.mContent);
            intent.putExtra("timestamp", this.mTimestamp);
            intent.putExtra("signature1", this.mSign1);
            intent.putExtra("timestamp1", this.mTimestamp1);
            try {
                if (!context.bindService(intent, this.mServiceConnection, 1)) {
                    Log.d(TAG, "Can't bind service");
                }
            } catch (SecurityException e) {
                Log.e(TAG, "SecurityException:" + e);
            }
        } else {
            dataServiceConnection.addItems(list);
        }
        return this.mServiceBinded;
    }
}
