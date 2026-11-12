package com.huami.watch.companion.components.bluetoothproxyserver.session;

import android.bluetooth.BluetoothSocket;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
public class BluetoothServerTransfer implements TransferWrapper.a {
    private static final String e = "BluetoothTransfer";
    private BluetoothSocket a;
    private InputStream b;
    private OutputStream c;
    private SocketErrorHandler d;

    public interface SocketErrorHandler {
        void onSocketError();
    }

    public BluetoothServerTransfer(BluetoothSocket bluetoothSocket, SocketErrorHandler socketErrorHandler) {
        this.d = socketErrorHandler;
        a(bluetoothSocket);
    }

    private void a(BluetoothSocket bluetoothSocket) {
        ProxyLog.D(e, "初始化蓝牙传输通道, 可能是重新初始化，先释放可能存在的资源.");
        release();
        this.a = bluetoothSocket;
        ProxyLog.I(e, ">>>>>> 获取蓝牙Socket >>>>>>");
        try {
            this.b = this.a.getInputStream();
            this.c = this.a.getOutputStream();
            ProxyLog.I(e, ">>>>>> 获取蓝牙InputStream >>>>>>");
            ProxyLog.I(e, ">>>>>> 获取蓝牙OutputStream >>>>>>");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.TransferWrapper.a
    public int receiveData(byte[] bArr) throws IOException {
        try {
            return this.b.read(bArr);
        } catch (IOException e2) {
            e2.printStackTrace();
            ProxyLog.D(e, "接收数据出错，重新初始化蓝牙通路");
            this.d.onSocketError();
            throw e2;
        }
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.TransferWrapper.a
    public void release() {
        ProxyLog.D(e, "释放蓝牙socket通路，关闭socket 输入输出流");
        if (this.a != null) {
            try {
                OutputStream outputStream = this.c;
                if (outputStream != null) {
                    outputStream.close();
                    ProxyLog.I(e, "<<<<<< 关闭蓝牙OutputStream <<<<<<");
                }
                InputStream inputStream = this.b;
                if (inputStream != null) {
                    inputStream.close();
                    ProxyLog.I(e, "<<<<<< 关闭蓝牙InputStream <<<<<<");
                }
                this.a.close();
                ProxyLog.I(e, "<<<<<< 关闭蓝牙Socket <<<<<<");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.TransferWrapper.a
    public void sendData(byte[] bArr) throws IOException {
        try {
            this.c.write(bArr);
            this.c.flush();
        } catch (IOException e2) {
            e2.printStackTrace();
            ProxyLog.D(e, "蓝牙通道发送数据出错，重新初始化蓝牙通路");
            this.d.onSocketError();
            throw e2;
        }
    }
}
