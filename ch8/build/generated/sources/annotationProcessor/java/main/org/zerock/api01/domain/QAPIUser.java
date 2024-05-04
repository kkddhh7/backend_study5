package org.zerock.api01.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAPIUser is a Querydsl query type for APIUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAPIUser extends EntityPathBase<APIUser> {

    private static final long serialVersionUID = 1399556226L;

    public static final QAPIUser aPIUser = new QAPIUser("aPIUser");

    public final StringPath mid = createString("mid");

    public final StringPath mpw = createString("mpw");

    public QAPIUser(String variable) {
        super(APIUser.class, forVariable(variable));
    }

    public QAPIUser(Path<? extends APIUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAPIUser(PathMetadata metadata) {
        super(APIUser.class, metadata);
    }

}

