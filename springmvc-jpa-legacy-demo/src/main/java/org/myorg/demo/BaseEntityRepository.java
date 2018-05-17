/**
 * 
 */
package org.myorg.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lavnish
 *
 */
public interface BaseEntityRepository extends JpaRepository<BaseEntity, Integer>
{

}
