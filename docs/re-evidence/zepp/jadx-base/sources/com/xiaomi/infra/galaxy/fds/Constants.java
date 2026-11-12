package com.xiaomi.infra.galaxy.fds;

/* JADX INFO: loaded from: classes22.dex */
public class Constants {
    public static final long DEFAULT_SPACE_LIMIT = 1073741824;
    public static final int MD5_BYTES_LENGTH = 16;
    public static final String TRASH_BUCKET_NAME = "trash";

    public enum Clusters {
        staging(0),
        cnbj0(1),
        cnbj1(2),
        tjwqsrv(3),
        awsbj0(4),
        awsusor0(5),
        awssgp0(6),
        awssgp1(7),
        awsde0(8),
        none(-1);

        public int id;

        Clusters(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
