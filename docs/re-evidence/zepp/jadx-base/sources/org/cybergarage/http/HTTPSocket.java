package org.cybergarage.http;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Calendar;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPSocket {
    private Socket socket = null;
    private InputStream sockIn = null;
    private OutputStream sockOut = null;

    public HTTPSocket(Socket socket) {
        setSocket(socket);
        open();
    }

    private OutputStream getOutputStream() {
        return this.sockOut;
    }

    private boolean post(HTTPResponse hTTPResponse, byte[] bArr, long j, long j2, boolean z) {
        hTTPResponse.setDate(Calendar.getInstance());
        OutputStream outputStream = getOutputStream();
        try {
            hTTPResponse.setContentLength(j2);
            outputStream.write(hTTPResponse.getHeader().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zIsChunked = hTTPResponse.isChunked();
            if (zIsChunked) {
                outputStream.write(Long.toHexString(j2).getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.write(bArr, (int) j, (int) j2);
            if (zIsChunked) {
                outputStream.write("\r\n".getBytes());
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void setInputStream(InputStream inputStream) {
        this.sockIn = inputStream;
    }

    private void setOutputStream(OutputStream outputStream) {
        this.sockOut = outputStream;
    }

    private void setSocket(Socket socket) {
        this.socket = socket;
    }

    public boolean close() {
        try {
            InputStream inputStream = this.sockIn;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.sockOut;
            if (outputStream != null) {
                outputStream.close();
            }
            getSocket().close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void finalize() {
        close();
    }

    public InputStream getInputStream() {
        return this.sockIn;
    }

    public String getLocalAddress() {
        return getSocket().getLocalAddress().getHostAddress();
    }

    public int getLocalPort() {
        return getSocket().getLocalPort();
    }

    public Socket getSocket() {
        return this.socket;
    }

    public boolean open() {
        Socket socket = getSocket();
        try {
            this.sockIn = socket.getInputStream();
            this.sockOut = socket.getOutputStream();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public HTTPSocket(HTTPSocket hTTPSocket) {
        setSocket(hTTPSocket.getSocket());
        setInputStream(hTTPSocket.getInputStream());
        setOutputStream(hTTPSocket.getOutputStream());
    }

    private boolean post(HTTPResponse hTTPResponse, InputStream inputStream, long j, long j2, boolean z) {
        hTTPResponse.setDate(Calendar.getInstance());
        OutputStream outputStream = getOutputStream();
        try {
            hTTPResponse.setContentLength(j2);
            outputStream.write(hTTPResponse.getHeader().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zIsChunked = hTTPResponse.isChunked();
            long j3 = 0;
            if (0 < j) {
                inputStream.skip(j);
            }
            int chunkSize = HTTP.getChunkSize();
            byte[] bArr = new byte[chunkSize];
            long j4 = chunkSize;
            int i = inputStream.read(bArr, 0, (int) (j4 < j2 ? j4 : j2));
            while (i > 0 && j3 < j2) {
                if (zIsChunked) {
                    outputStream.write(Long.toHexString(i).getBytes());
                    outputStream.write("\r\n".getBytes());
                }
                outputStream.write(bArr, 0, i);
                if (zIsChunked) {
                    outputStream.write("\r\n".getBytes());
                }
                j3 += (long) i;
                long j5 = j2 - j3;
                if (j4 < j5) {
                    j5 = j4;
                }
                i = inputStream.read(bArr, 0, (int) j5);
            }
            if (zIsChunked) {
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean post(HTTPResponse hTTPResponse, long j, long j2, boolean z) {
        if (hTTPResponse.hasContentInputStream()) {
            return post(hTTPResponse, hTTPResponse.getContentInputStream(), j, j2, z);
        }
        return post(hTTPResponse, hTTPResponse.getContent(), j, j2, z);
    }
}
