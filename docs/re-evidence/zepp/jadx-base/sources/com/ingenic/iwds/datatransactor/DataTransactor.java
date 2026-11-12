package com.ingenic.iwds.datatransactor;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.app.ConnectionHelper;
import com.ingenic.iwds.common.exception.FileStatusException;
import com.ingenic.iwds.common.exception.FileTransferException;
import com.ingenic.iwds.common.exception.LinkDisconnectedException;
import com.ingenic.iwds.common.exception.LinkUnbondedException;
import com.ingenic.iwds.common.exception.PortClosedException;
import com.ingenic.iwds.common.exception.PortDisconnectedException;
import com.ingenic.iwds.common.exception.SerializeException;
import com.ingenic.iwds.os.SafeParcelable;
import com.ingenic.iwds.uniconnect.Connection;
import com.ingenic.iwds.uniconnect.ConnectionServiceManager;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import com.ingenic.iwds.utils.serializable.TransferAdapter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class DataTransactor extends TransactorParcelableCreator<Parcelable, SafeParcelable> {
    private CallbackHandler m_callbackHandler;
    private Controller m_controller;
    private Helper m_helper;
    private ObjectExchangeCallback m_obexCallback;
    private Reader m_reader;
    private Sender m_sender;
    private TransferAdapterObserver m_tranfserAdapterObserver;
    private String m_uuid;

    public class DataTransactResult {
        public static final int RESULT_FAILED_CHANNEL_UNAVAILABLE = 1;
        public static final int RESULT_FAILED_FILE_STATUS_ERROR = 4;
        public static final int RESULT_FAILED_IWDS_CRASH = 3;
        public static final int RESULT_FAILED_LINK_DISCONNECTED = 2;
        public static final int RESULT_OK = 0;
        private int m_resultCode;
        private Object m_transferedObject;

        public DataTransactResult(Object obj, int i) {
            this.m_transferedObject = obj;
            this.m_resultCode = i;
        }

        public int getResultCode() {
            return this.m_resultCode;
        }

        public Object getTransferedObject() {
            return this.m_transferedObject;
        }
    }

    public interface DataTransactorCallback {
        void onChannelAvailable(boolean z);

        void onDataArrived(Object obj);

        void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z);

        void onRecvFileProgress(int i);

        void onSendFileProgress(int i);

        void onSendResult(DataTransactResult dataTransactResult);
    }

    public interface DataTransactorInterruptCallback {
        void onRecvFileInterrupted(int i);

        void onSendFileInterrupted(int i);
    }

    public class Helper extends ConnectionHelper {
        public Helper(Context context) {
            super(context);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onConnectedDevice(DeviceDescriptor deviceDescriptor) {
            DataTransactor.this.m_controller.handleDeviceConnected(deviceDescriptor);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onDisconnectedDevice(DeviceDescriptor deviceDescriptor) {
            DataTransactor.this.m_controller.handleDeviceDisconnected(deviceDescriptor);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onServiceConnected(ConnectionServiceManager connectionServiceManager) {
            DataTransactor.this.m_controller.start(connectionServiceManager);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onServiceDisconnected(boolean z) {
            DataTransactor.this.m_controller.stop();
        }
    }

    public interface ObjectExchangeCallback {
        Object recv(Connection connection) throws SerializeException, IOException;

        void send(Connection connection, Object obj) throws SerializeException, IOException;
    }

    public class Reader {
        private Connection m_connection;
        private DeviceDescriptor m_deviceDescriptor;
        private ReadThread m_thread;

        public class ReadThread extends Thread {
            private boolean m_isRunning;
            private boolean m_requestStop;
            private Object m_runLock;

            public ReadThread() {
                super("DataTransactor_reader: UUID: " + DataTransactor.this.m_uuid);
                this.m_runLock = new Object();
                this.m_isRunning = false;
                this.m_requestStop = false;
            }

            private void closeConnection() {
                synchronized (this) {
                    Reader.this.m_connection.close();
                }
            }

            private boolean openConnection() {
                synchronized (this) {
                    int iOpen = Reader.this.m_connection.open(Reader.this.m_deviceDescriptor, DataTransactor.this.m_uuid);
                    IwdsAssert.dieIf(this, iOpen == -3, "Uuid was conflict.");
                    return iOpen >= 0;
                }
            }

            private void setRunning(boolean z) {
                synchronized (this.m_runLock) {
                    this.m_isRunning = z;
                }
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Object objRecv;
                setRunning(true);
                DataTransactor.this.m_callbackHandler.notifyLinkConnected(Reader.this.m_deviceDescriptor, true);
                Throwable cause = null;
                do {
                    synchronized (this.m_runLock) {
                        if (this.m_requestStop) {
                            break;
                        }
                        if (!openConnection()) {
                            break;
                        }
                        setName("DataTransactor_reader: UUID: " + DataTransactor.this.m_uuid + ", Port: " + Reader.this.m_connection.getPort());
                        if (Reader.this.m_connection.handshake() != 0) {
                            closeConnection();
                            break;
                        }
                        DataTransactor.this.m_controller.setReadyToSend(true);
                        DataTransactor.this.m_callbackHandler.notifyConnectionConnected(true);
                        while (true) {
                            try {
                                if (DataTransactor.this.m_obexCallback != null) {
                                    objRecv = DataTransactor.this.m_obexCallback.recv(Reader.this.m_connection);
                                } else {
                                    Connection connection = Reader.this.m_connection;
                                    DataTransactor dataTransactor = DataTransactor.this;
                                    objRecv = TransferAdapter.recv(connection, dataTransactor.m_parcelableCreator, dataTransactor.m_safeParcelableCreator, dataTransactor.m_tranfserAdapterObserver);
                                }
                                DataTransactor.this.m_callbackHandler.notifyDataArrived(objRecv);
                            } catch (FileTransferException e) {
                                DataTransactor.this.m_callbackHandler.notifyDataArrived(e);
                                DataTransactor.this.m_callbackHandler.notifyConnectionConnected(false);
                                DataTransactor.this.m_controller.setReadyToSend(false);
                                closeConnection();
                                if (!(cause instanceof LinkDisconnectedException) || (cause instanceof LinkUnbondedException) || (cause instanceof PortClosedException)) {
                                    break;
                                }
                                DataTransactor.this.m_callbackHandler.notifyLinkConnected(Reader.this.m_deviceDescriptor, false);
                                setRunning(false);
                            } catch (SerializeException e2) {
                                IwdsAssert.dieIf((Object) this, true, "Serialize exception: " + e2);
                            } catch (IOException e3) {
                                cause = e3.getCause();
                                DataTransactor.this.m_callbackHandler.notifyConnectionConnected(false);
                                DataTransactor.this.m_controller.setReadyToSend(false);
                                closeConnection();
                                if (!(cause instanceof LinkDisconnectedException)) {
                                    break;
                                } else {
                                    break;
                                }
                                DataTransactor.this.m_callbackHandler.notifyLinkConnected(Reader.this.m_deviceDescriptor, false);
                                setRunning(false);
                            }
                        }
                    }
                } while (!(cause instanceof RemoteException));
                DataTransactor.this.m_callbackHandler.notifyLinkConnected(Reader.this.m_deviceDescriptor, false);
                setRunning(false);
            }

            @Override // java.lang.Thread
            public void start() {
                super.start();
            }

            public void stopThread() {
                synchronized (this.m_runLock) {
                    this.m_requestStop = true;
                    if (this.m_isRunning) {
                        closeConnection();
                    }
                }
            }
        }

        private Reader() {
        }

        public void start(DeviceDescriptor deviceDescriptor, Connection connection) {
            this.m_deviceDescriptor = deviceDescriptor;
            this.m_connection = connection;
            ReadThread readThread = new ReadThread();
            this.m_thread = readThread;
            readThread.start();
        }

        public void stop() {
            this.m_thread.stopThread();
        }
    }

    public class TransferAdapterObserver implements TransferAdapter.TransferAdapterCallback {
        private TransferAdapterObserver() {
        }

        @Override // com.ingenic.iwds.utils.serializable.TransferAdapter.TransferAdapterCallback
        public void onFileTransferError(FileTransferException fileTransferException) {
            IwdsLog.i(this, "File transfer error!");
            DataTransactor.this.m_callbackHandler.notifyDataArrived(fileTransferException);
        }

        @Override // com.ingenic.iwds.utils.serializable.TransferAdapter.TransferAdapterCallback
        public void onRecvFileInterrupted(int i) {
            IwdsLog.i(this, "File recv interrupted index: " + i);
            DataTransactor.this.m_callbackHandler.notifyFileTransactionInterrupted(i, false);
        }

        @Override // com.ingenic.iwds.utils.serializable.TransferAdapter.TransferAdapterCallback
        public void onRecvFileProgress(long j, long j2) {
            int i = (int) ((j * 100) / j2);
            IwdsLog.i(this, "File recv progress: " + i);
            DataTransactor.this.m_callbackHandler.notifyFileTransactionProgress(i, false);
        }

        @Override // com.ingenic.iwds.utils.serializable.TransferAdapter.TransferAdapterCallback
        public void onSendFileInterrupted(int i) {
            IwdsLog.i(this, "File send interrupted index: " + i);
            DataTransactor.this.m_callbackHandler.notifyFileTransactionInterrupted(i, true);
        }

        @Override // com.ingenic.iwds.utils.serializable.TransferAdapter.TransferAdapterCallback
        public void onSendFileProgress(long j, long j2) {
            int i = (int) ((j * 100) / j2);
            IwdsLog.i(this, "File send progress: " + i);
            DataTransactor.this.m_callbackHandler.notifyFileTransactionProgress(i, true);
        }
    }

    public DataTransactor(Context context, DataTransactorCallback dataTransactorCallback, String str) {
        boolean z = true;
        IwdsAssert.dieIf(this, dataTransactorCallback == null, "Callback is null.");
        if (str != null && !str.isEmpty()) {
            z = false;
        }
        IwdsAssert.dieIf(this, z, "Uuid is null or empty.");
        this.m_uuid = str;
        this.m_helper = new Helper(context);
        this.m_callbackHandler = new CallbackHandler(dataTransactorCallback);
        this.m_reader = new Reader();
        this.m_sender = new Sender();
        this.m_controller = new Controller();
        this.m_tranfserAdapterObserver = new TransferAdapterObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReader(DeviceDescriptor deviceDescriptor, Connection connection) {
        this.m_reader.start(deviceDescriptor, connection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSender(Connection connection) {
        this.m_sender.start(connection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopReader() {
        this.m_reader.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopSender() {
        this.m_sender.stop();
    }

    public void cancelAll() {
        this.m_controller.cancelAll();
    }

    public DeviceDescriptor filerDeviceDescriptor(DeviceDescriptor deviceDescriptor) {
        return deviceDescriptor;
    }

    public void finalize() throws Throwable {
        super.finalize();
        stop();
    }

    public boolean isStarted() {
        return this.m_helper.isStarted();
    }

    public void send(Object obj) {
        IwdsAssert.dieIf(this, obj == null, "Object is null.");
        if (obj instanceof File) {
            send((File) obj);
        } else {
            this.m_controller.send(obj);
        }
    }

    public void start() {
        this.m_helper.start();
    }

    public void stop() {
        this.m_helper.stop();
    }

    public class CallbackHandler extends Handler {
        public static final int MSG_NOTIFY_CHANNLE_STATUS = 2;
        public static final int MSG_NOTIFY_DATA_ARRIVED = 4;
        public static final int MSG_NOTIFY_FILE_TRANSACTION_INTERRUPTED = 6;
        public static final int MSG_NOTIFY_FILE_TRANSACTION_PROGRESS = 5;
        public static final int MSG_NOTIFY_LINK_STATUS = 1;
        public static final int MSG_NOTIFY_SEND_RESULT = 3;
        private DataTransactorInterruptCallback i_callback;
        private DataTransactorCallback m_callback;

        public CallbackHandler(DataTransactorCallback dataTransactorCallback) {
            this.m_callback = dataTransactorCallback;
            this.i_callback = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.m_callback.onLinkConnected((DeviceDescriptor) message.obj, message.arg1 != 0);
                    break;
                case 2:
                    this.m_callback.onChannelAvailable(message.arg1 != 0);
                    break;
                case 3:
                    this.m_callback.onSendResult((DataTransactResult) message.obj);
                    break;
                case 4:
                    this.m_callback.onDataArrived(message.obj);
                    break;
                case 5:
                    if (message.arg1 != 1) {
                        this.m_callback.onRecvFileProgress(message.arg2);
                    } else {
                        this.m_callback.onSendFileProgress(message.arg2);
                    }
                    break;
                case 6:
                    DataTransactorInterruptCallback dataTransactorInterruptCallback = this.i_callback;
                    if (dataTransactorInterruptCallback != null) {
                        if (message.arg1 != 1) {
                            dataTransactorInterruptCallback.onRecvFileInterrupted(message.arg2);
                        } else {
                            dataTransactorInterruptCallback.onSendFileInterrupted(message.arg2);
                        }
                        break;
                    }
                    break;
                default:
                    IwdsAssert.dieIf((Object) this, true, "Implement me.");
                    break;
            }
        }

        public void notifyConnectionConnected(boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 2;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.sendToTarget();
        }

        public void notifyDataArrived(Object obj) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 4;
            messageObtain.obj = obj;
            messageObtain.sendToTarget();
        }

        public void notifyFileTransactionInterrupted(int i, boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 6;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.arg2 = i;
            messageObtain.sendToTarget();
        }

        public void notifyFileTransactionProgress(int i, boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 5;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.arg2 = i;
            messageObtain.sendToTarget();
        }

        public void notifyLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 1;
            messageObtain.arg1 = z ? 1 : 0;
            messageObtain.obj = deviceDescriptor;
            messageObtain.sendToTarget();
        }

        public void notifySendResult(DataTransactResult dataTransactResult) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 3;
            messageObtain.obj = dataTransactResult;
            messageObtain.sendToTarget();
        }

        public CallbackHandler(DataTransactorCallback dataTransactorCallback, DataTransactorInterruptCallback dataTransactorInterruptCallback) {
            this.m_callback = dataTransactorCallback;
            this.i_callback = dataTransactorInterruptCallback;
        }
    }

    public class Sender {
        public static final int MSG_QUIT = 1;
        public static final int MSG_SEND = 0;
        private Connection m_connection;
        private SendHandler m_handler;
        private HandlerThread m_thread;

        public class SendHandler extends Handler {
            public SendHandler(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    Sender.this.m_thread.quit();
                    return;
                }
                DataTransactResult dataTransactResult = null;
                Object obj = message.obj;
                try {
                    if (DataTransactor.this.m_obexCallback != null) {
                        DataTransactor.this.m_obexCallback.send(Sender.this.m_connection, obj);
                    } else if (obj instanceof File) {
                        TransferAdapter.send(Sender.this.m_connection, (File) obj, message.arg1, DataTransactor.this.m_tranfserAdapterObserver);
                    } else {
                        Connection connection = Sender.this.m_connection;
                        DataTransactor dataTransactor = DataTransactor.this;
                        TransferAdapter.send(connection, obj, dataTransactor.m_parcelableCreator, dataTransactor.m_safeParcelableCreator);
                    }
                    dataTransactResult = DataTransactor.this.new DataTransactResult(obj, 0);
                } catch (FileTransferException e) {
                    if (e.getCause() instanceof FileStatusException) {
                        dataTransactResult = DataTransactor.this.new DataTransactResult(obj, 4);
                    }
                } catch (SerializeException e2) {
                    IwdsAssert.dieIf((Object) this, true, "Serialize exception: " + e2);
                } catch (IOException e3) {
                    Throwable cause = e3.getCause();
                    if ((cause instanceof LinkDisconnectedException) || (cause instanceof LinkUnbondedException)) {
                        dataTransactResult = DataTransactor.this.new DataTransactResult(obj, 2);
                    } else if ((cause instanceof PortDisconnectedException) || (cause instanceof PortClosedException)) {
                        dataTransactResult = DataTransactor.this.new DataTransactResult(obj, 1);
                    } else if (cause instanceof RemoteException) {
                        dataTransactResult = DataTransactor.this.new DataTransactResult(obj, 3);
                    }
                }
                DataTransactor.this.m_callbackHandler.notifySendResult(dataTransactResult);
            }
        }

        private Sender() {
        }

        public void cancelAll() {
            if (this.m_thread == null) {
                return;
            }
            this.m_handler.removeMessages(0);
        }

        public void send(Object obj) {
            if (this.m_thread == null) {
                return;
            }
            Message messageObtain = Message.obtain(this.m_handler);
            messageObtain.what = 0;
            messageObtain.obj = obj;
            messageObtain.sendToTarget();
        }

        public void start(Connection connection) {
            if (this.m_thread != null) {
                return;
            }
            this.m_connection = connection;
            HandlerThread handlerThread = new HandlerThread("DataTransactor_sender: UUID: " + DataTransactor.this.m_uuid + ", Port: " + this.m_connection.getPort());
            this.m_thread = handlerThread;
            handlerThread.start();
            this.m_handler = new SendHandler(this.m_thread.getLooper());
        }

        public void stop() {
            if (this.m_thread == null) {
                return;
            }
            Message.obtain(this.m_handler, 1).sendToTarget();
            try {
                this.m_thread.join();
            } catch (InterruptedException unused) {
            }
            this.m_handler = null;
            this.m_thread = null;
        }

        public void send(File file, int i) {
            if (this.m_thread == null) {
                return;
            }
            Message messageObtain = Message.obtain(this.m_handler);
            messageObtain.what = 0;
            messageObtain.arg1 = i;
            messageObtain.obj = file;
            messageObtain.sendToTarget();
        }
    }

    public void send(File file, int i) {
        IwdsAssert.dieIf(this, file == null, "file is null.");
        this.m_controller.send(file, i);
    }

    public class Controller {
        private Connection m_connection;
        private DeviceDescriptor m_deviceDescriptor;
        private boolean m_readyToSend;
        private ConnectionServiceManager m_service;

        private Controller() {
            this.m_readyToSend = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleDeviceConnected(DeviceDescriptor deviceDescriptor) {
            DeviceDescriptor deviceDescriptorFilerDeviceDescriptor;
            if (this.m_deviceDescriptor == null && (deviceDescriptorFilerDeviceDescriptor = DataTransactor.this.filerDeviceDescriptor(deviceDescriptor)) != null) {
                this.m_deviceDescriptor = deviceDescriptorFilerDeviceDescriptor;
                DataTransactor.this.startReader(deviceDescriptorFilerDeviceDescriptor, this.m_connection);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleDeviceDisconnected(DeviceDescriptor deviceDescriptor) {
            if (deviceDescriptor.equals(this.m_deviceDescriptor)) {
                DataTransactor.this.stopReader();
                this.m_deviceDescriptor = null;
            }
        }

        public void cancelAll() {
            synchronized (this) {
                DataTransactor.this.m_sender.cancelAll();
            }
        }

        public void send(Object obj) {
            synchronized (this) {
                if (this.m_readyToSend) {
                    DataTransactor.this.m_sender.send(obj);
                } else {
                    DataTransactor.this.m_callbackHandler.notifySendResult(DataTransactor.this.new DataTransactResult(obj, 1));
                }
            }
        }

        public void setReadyToSend(boolean z) {
            synchronized (this) {
                try {
                    if (z) {
                        DataTransactor.this.startSender(this.m_connection);
                        this.m_readyToSend = true;
                    } else {
                        this.m_readyToSend = false;
                        DataTransactor.this.stopSender();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void start(ConnectionServiceManager connectionServiceManager) {
            this.m_service = connectionServiceManager;
            this.m_connection = connectionServiceManager.createConnection();
        }

        public void stop() {
            this.m_connection = null;
            this.m_service = null;
        }

        public void send(File file, int i) {
            synchronized (this) {
                if (this.m_readyToSend) {
                    DataTransactor.this.m_sender.send(file, i);
                } else {
                    DataTransactor.this.m_callbackHandler.notifySendResult(DataTransactor.this.new DataTransactResult(file, 1));
                }
            }
        }
    }

    public void send(File file) {
        IwdsAssert.dieIf(this, file == null, "file is null.");
        send(file, 0);
    }

    public DataTransactor(Context context, DataTransactorCallback dataTransactorCallback, DataTransactorInterruptCallback dataTransactorInterruptCallback, String str) {
        boolean z = true;
        IwdsAssert.dieIf(this, dataTransactorCallback == null, "Callback is null.");
        IwdsAssert.dieIf(this, dataTransactorInterruptCallback == null, "Callback is null.");
        if (str != null && !str.isEmpty()) {
            z = false;
        }
        IwdsAssert.dieIf(this, z, "Uuid is null or empty.");
        this.m_uuid = str;
        this.m_helper = new Helper(context);
        this.m_callbackHandler = new CallbackHandler(dataTransactorCallback, dataTransactorInterruptCallback);
        this.m_reader = new Reader();
        this.m_sender = new Sender();
        this.m_controller = new Controller();
        this.m_tranfserAdapterObserver = new TransferAdapterObserver();
    }

    public DataTransactor(Context context, DataTransactorCallback dataTransactorCallback, ObjectExchangeCallback objectExchangeCallback, String str) {
        boolean z = true;
        IwdsAssert.dieIf(this, dataTransactorCallback == null, "DataTransactorCallback is null.");
        IwdsAssert.dieIf(this, objectExchangeCallback == null, "ObjectExchangeCallback is null.");
        if (str != null && !str.isEmpty()) {
            z = false;
        }
        IwdsAssert.dieIf(this, z, "Uuid is null or empty.");
        this.m_uuid = str;
        this.m_helper = new Helper(context);
        this.m_callbackHandler = new CallbackHandler(dataTransactorCallback);
        this.m_reader = new Reader();
        this.m_sender = new Sender();
        this.m_controller = new Controller();
        this.m_obexCallback = objectExchangeCallback;
    }
}
