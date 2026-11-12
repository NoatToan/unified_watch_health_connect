package com.garmin.android.gfdi.framework;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class PacketQueue {
    private static final int QUEUE_SIZE = 50;
    private static final String TAG = "CIQ#PacketQueue";
    private static final Logger mLogger;
    private WeakReference<ma2.d> bleConn;
    private ArrayBlockingQueue<Packet> packetQueue;
    private PacketTransferThread thread;
    private AtomicBoolean isStopped = new AtomicBoolean(false);
    private AtomicBoolean sendConfirmed = new AtomicBoolean(false);

    public class Packet {
        int attempts;
        long lastAttemptTime;
        byte[] packetData;
        UUID service;
        UUID writeCharacteristic;

        public Packet(UUID uuid, UUID uuid2, byte[] bArr) {
            this.service = uuid;
            this.writeCharacteristic = uuid2;
            byte[] bArr2 = new byte[bArr.length];
            this.packetData = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.lastAttemptTime = 0L;
            this.attempts = 0;
        }
    }

    public final class PacketTransferThread extends Thread {
        private static final long CONFIRMATION_TIMEOUT = 100;
        private static final int MAX_RETRY_ATTEMPTS = 3;
        private Packet transferPacket;

        private PacketTransferThread() {
            this.transferPacket = null;
        }

        private void sendPacket(Packet packet) {
            synchronized (this) {
                try {
                    if (PacketQueue.this.bleConn != null && PacketQueue.this.bleConn.get() != null) {
                        this.transferPacket.lastAttemptTime = System.currentTimeMillis();
                        this.transferPacket.attempts++;
                        PacketQueue.this.sendConfirmed.set(false);
                        ma2.d dVar = (ma2.d) PacketQueue.this.bleConn.get();
                        Packet packet2 = this.transferPacket;
                        dVar.c(packet2.service, packet2.writeCharacteristic, packet2.packetData);
                        PacketQueue.mLogger.debug("Sending packet " + ft2.b.a(this.transferPacket.packetData));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!PacketQueue.this.isStopped()) {
                try {
                    this.transferPacket = (Packet) PacketQueue.this.packetQueue.poll(60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (PacketQueue.this.isStopped()) {
                    return;
                }
                Packet packet = this.transferPacket;
                if (packet != null) {
                    sendPacket(packet);
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException unused2) {
                    }
                    while (!PacketQueue.this.isConfirmed()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Packet packet2 = this.transferPacket;
                        if (jCurrentTimeMillis - packet2.lastAttemptTime <= CONFIRMATION_TIMEOUT) {
                            Thread.sleep(20L);
                        } else {
                            if (packet2.attempts >= 3) {
                                break;
                            }
                            sendPacket(packet2);
                            Thread.sleep(20L);
                        }
                    }
                }
            }
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        mLogger = gt2.b.f79005a.i(TAG);
    }

    public PacketQueue(ma2.d dVar) {
        this.bleConn = null;
        this.packetQueue = null;
        this.bleConn = new WeakReference<>(dVar);
        this.packetQueue = new ArrayBlockingQueue<>(50);
        PacketTransferThread packetTransferThread = new PacketTransferThread();
        this.thread = packetTransferThread;
        packetTransferThread.start();
    }

    public boolean enqueuePacket(UUID uuid, UUID uuid2, byte[] bArr) {
        mLogger.debug("Enqueuing packet " + ft2.b.a(bArr));
        return this.packetQueue.offer(new Packet(uuid, uuid2, bArr));
    }

    public boolean isConfirmed() {
        return this.sendConfirmed.get();
    }

    public boolean isStopped() {
        return this.isStopped.get();
    }

    public void setConfirmed(boolean z14) {
        this.sendConfirmed.set(z14);
    }

    public void stop() {
        this.isStopped.set(true);
    }
}
