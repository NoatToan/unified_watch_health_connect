package com.huawei.healthcloud.plugintrack.golf.device;

import com.huawei.healthcloud.plugintrack.golf.Utils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class CourseListFileData {
    private List<byte[]> mDataList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(byte[] bArr) {
        this.mDataList.add(bArr);
    }

    public byte[] getBytes() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        Iterator<byte[]> it = this.mDataList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    public int getSize() {
        Iterator<byte[]> it = this.mDataList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        return length;
    }

    public static class Builder {
        private int mCourseDataTotalSize;
        private GolfMsgHeader.Builder mMsgHeadBuilder = new GolfMsgHeader.Builder().setBusinessType(GolfHiWearBusinessType.GOLF_COURSE_LIST_FILE.getTypeValue()).setVersion(1);
        private List<byte[]> mCourseDataList = new ArrayList();

        public Builder setSessionId(int i) {
            this.mMsgHeadBuilder.setMessageId(i);
            return this;
        }

        public Builder addCourseData(byte[] bArr) {
            if (bArr != null) {
                this.mCourseDataList.add(bArr);
                this.mCourseDataTotalSize += bArr.length;
            }
            return this;
        }

        public CourseListFileData build() {
            CourseListFileData courseListFileData = new CourseListFileData();
            this.mMsgHeadBuilder.setDataLength(this.mCourseDataTotalSize);
            this.mMsgHeadBuilder.setResponseState(0);
            courseListFileData.addData(this.mMsgHeadBuilder.builder().getBytes());
            courseListFileData.addData(Utils.int2Bytes(this.mCourseDataTotalSize));
            Iterator<byte[]> it = this.mCourseDataList.iterator();
            while (it.hasNext()) {
                courseListFileData.addData(it.next());
            }
            return courseListFileData;
        }
    }
}
